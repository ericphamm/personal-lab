document.addEventListener("DOMContentLoaded", function() {
	let konverzaceList = document.querySelectorAll('[data-hovorici]')

	function nahradNovouVetu(element) {
		let hovorici = element.getAttribute("data-hovorici");
		let novaVeta = `"${element.textContent}"`;

		let novaVsuvka = document.createElement("span");
		novaVsuvka.textContent = `${hovorici} rekl:`;

		element.textContent = ""; //smazat celou vetu
		
		element.appendChild(novaVsuvka); //pridat vsuvku/span
		element.appendChild(document.createTextNode(novaVeta)); //pridat vsuvku/span
	};

	for (let veta of konverzaceList) {
		nahradNovouVetu(veta);
	}

	let text = "Ahoj světe";
	let paragraph = document.createElement("p");
	paragraph.textContent = text;
	document.body.appendChild(paragraph);

	zmenText();
	setInterval(zmenText, 300);


	function zmenText() {
		if (paragraph.textContent == text) {
			paragraph.textContent = "";
		} else {
			let pismenoKpridani = text[paragraph.textContent.length];
			paragraph.textContent += pismenoKpridani;

			if (pismenoKpridani == " ") {
				zmenText();
			}
		}
	}


	function zmenBarvu() {
		let r = Math.round(Math.random() * 255);
		let g = Math.round(Math.random() * 255);
		let b = Math.round(Math.random() * 255);
		document.body.style.backgroundColor = "rgb(" + r + "," + g + "," + b + ")";
	}

	// // Načtení stránky
	// window.onload = function () {
	// 	zmenBarvu();
	// 	setInterval(zmenBarvu, 3000);
	// };

});