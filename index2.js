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
	div.querySelectorAll("a").forEach(a => {
		if (a.href.includes("/prob/p")) problemsList.push(a.href);
	});

	problemsList.forEach(async url => {
		const fetchedHTML = await fetchHTML(url);
		div = document.createElement("div");
		div.innerHTML = fetchedHTML;
		problemDescription = div
			.querySelectorAll("table tr td")[3]
			.innerText.split("Go...")[0];
		problemSolution = div.querySelectorAll("#ace_div")[0].innerText;
		problemsAndSolutions.push({
			description: problemDescription,
			solution: problemSolution
		});
	});
});
