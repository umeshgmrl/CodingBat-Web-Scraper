problemsAndSolutions = [];
count = 0;

sections = Array.from(document.querySelectorAll("a"))
	.map(a => (a.href.includes("/java/") ? a.href : null))
	.filter(Boolean);

extractProblems = url =>
	new Promise(async (res, rej) => {
		const fetchedHTML = await fetchHTML(url);
		div = document.createElement("div");
		div.innerHTML = fetchedHTML;
		let sectionTitle = div.querySelectorAll("span.h2")[0].innerText;
		let section = {
			title: sectionTitle,
			problems: []
		};
		div.querySelectorAll("a").forEach(a => {
			if (a.href.includes("/prob/p")) section.problems.push(a.href);
		});
		res(section);
	});

extractProblemData = url =>
	new Promise(async (res, rej) => {
		const fetchedHTML = await fetchHTML(url);
		div = document.createElement("div");
		div.innerHTML = fetchedHTML;
		problemTitle = div.querySelectorAll("span.h2")[1].innerText;
		problemDescription = div
			.querySelectorAll("table tr td")[3]
			.innerText.split("Go...")[0];
		problemSolution = div.querySelectorAll("#ace_div")[0].innerText;
		res({
			problemTitle,
			problemDescription,
			problemSolution
		});
	});

fetchHTML = async url => {
	const rawData = await fetch(url);
	const HTMLText = await rawData.text();
	return HTMLText;
};

exportDataToFile = () => {
	dlAnchorElem = document.createElement("a");
	dataStr =
		"data:text/json;charset=utf-8," +
		encodeURIComponent(JSON.stringify(problemsAndSolutions, null, 2));
	dlAnchorElem.setAttribute("href", dataStr);
	dlAnchorElem.setAttribute("download", "dump.json");
	dlAnchorElem.click();
};

promises = sections.map(section => extractProblems(section));

Promise.all(promises).then(data => {
	data.map((a, id) => {
		problemPromises = a.problems.map(section => extractProblemData(section));
		Promise.all(problemPromises).then(problems => {
			problemsAndSolutions.push({
				sectionTitle: a.title,
				problems: problems
			});
			count++;
			console.log(count);
			if (count == 17) exportDataToFile();
		});
	});
});
