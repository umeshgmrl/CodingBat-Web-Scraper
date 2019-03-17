div = document.createElement('div');
div.innerHTML = fetchedHTML;


sectionsList = [];
document.querySelectorAll('a').forEach(a => {
	if(a.href.includes('/java/')) sectionsList.push(a.href);
});


problemsList = [];
document.querySelectorAll('a').forEach(a => {
	if(a.href.includes('.com/prob/')) problemsList.push(a.href);
});


problemDescription = document.querySelectorAll('table tr td')[3].innerText.split('\n\nGo...')[0];
problemSolution = document.getElementById('ace_div').innerText;


