problemsAndSolutions = [];
sectionsList = [];
document.querySelectorAll("a").forEach(a => {
	if (a.href.includes("/java/")) sectionsList.push(a.href);
});

fetchHTML = async url => {
	const rawData = await fetch(url);
	const HTMLText = await rawData.text();
	return HTMLText;
};

sectionsList.forEach(async url => {
	const fetchedHTML = await fetchHTML(url);
	div = document.createElement("div");
	div.innerHTML = fetchedHTML;
	problemsList = [];
	sectionTitle = div.querySelectorAll("span.h2")[0].innerText;
	section = {
		title: sectionTitle,
		problems: []
	};

	div.querySelectorAll("a").forEach(a => {
		if (a.href.includes("/prob/p")) problemsList.push(a.href);
	});

	problemsList.forEach(async url => {
		const fetchedHTML = await fetchHTML(url);
		div = document.createElement("div");
		div.innerHTML = fetchedHTML;

		problemTitle = div.querySelectorAll("span.h2")[1].innerText;

		problemDescription = div
			.querySelectorAll("table tr td")[3]
			.innerText.split("Go...")[0];

		problemSolution = div.querySelectorAll("#ace_div")[0].innerText;

		section.problems.push({
			title: problemTitle,
			description: problemDescription,
			solution: problemSolution
		});
	});
	section.problems = problemsList;
	problemsAndSolutions.push(section);
});

// dlAnchorElem = document.createElement("a");
// dataStr =
// 	"data:text/json;charset=utf-8," +
// 	encodeURIComponent(JSON.stringify(problemsAndSolutions, null, 2));
// dlAnchorElem.setAttribute("href", dataStr);
// dlAnchorElem.setAttribute("download", "scene11.json");
// dlAnchorElem.click();
