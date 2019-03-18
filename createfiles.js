const fs = require("fs");
let obj = JSON.parse(fs.readFileSync("dump.json", "utf8"));


obj.map(o => {
	let folderName = o.sectionTitle;
	console.log(folderName);
	fs.mkdirSync(folderName);

	o.problems.map(p => {
		let text = `/*${p.problemDescription.match(/(.{1,90})/g).join('\n')}*/\n\n${p.problemSolution}`;
		fs.writeFile(`${folderName}/${p.problemTitle}.java`, text, function(err) {
			if (err) {
				return console.log(err);
			}
			console.log("The file was saved!");
		});
	});
});
