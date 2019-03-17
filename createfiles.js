const fs = require("fs");
let obj = JSON.parse(fs.readFileSync("scene.json", "utf8"));

obj = [obj[0]];

obj.map(o => {
	let folderName = o.title;
	console.log(folderName);
	fs.mkdirSync(folderName);
	o.problems.map(p => {
		let text = `/*${p.description}*/

		${p.solution}
		`;
		fs.writeFile(`${folderName}/${p.title}.java`, text, function(err) {
			if (err) {
				return console.log(err);
			}
			console.log("The file was saved!");
		});
	});
});
