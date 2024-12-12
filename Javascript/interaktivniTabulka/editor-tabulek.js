let tabulka;
let sloupcu = 5;
let radku = 3;
let aktivniBunka;

function vytvorVychoziTabulku() {
	tabulka = document.createElement("table");
	document.body.appendChild(tabulka);

	for (let y = 0; y < radku; y++) {
		let tr = document.createElement("tr");
		tabulka.appendChild(tr);

		for (let x = 0; x < sloupcu; x++) {
			tr.appendChild(vytvorBunku());
		}
	}
}

function vytvorBunku() {
	let td = document.createElement("td");
	let tdInput = document.createElement("input");
	tdInput.type = "text";
	tdInput.onfocus = function() {
		if (aktivniBunka) {
			aktivniBunka.style.background = "";
		}
		aktivniBunka = this;
		aktivniBunka.style.background = "yellow";
	};
	td.appendChild(tdInput);
	return td;
}

function vytvorTlacitko(popisek) {
	let btn = document.createElement("button");
	btn.textContent = popisek;
	document.body.appendChild(btn);
	return btn;
}

function vytvorOvladaciTlacitka() {
	vytvorTlacitko("Přidat řádek dolů").onclick = pridejRadekDolu;
	vytvorTlacitko("Přidat řádek nahoru").onclick = pridejRadekNahoru;
	vytvorTlacitko("Přidat sloupec vlevo");
	vytvorTlacitko("Přidat sloupec vpravo");
	vytvorTlacitko("Odstranit řádek");
	vytvorTlacitko("Odstranit sloupec");
}

function vytvorRadek() {
	let novyRadek = document.createElement("tr");
	let pocetBunekVPrvnimRadku = tabulka.firstElementChild.querySelectorAll("td").length;

	for (let i = 0; i < pocetBunekVPrvnimRadku; i ++) {
		novyRadek.appendChild(vytvorBunku());
	}
	return novyRadek;
}

function indexRadkuAktivniBunky() {
	let uzlyTabulky = tabulka.childNodes;
	let hledanyRadek = aktivniBunka.parentElement.parentElement;

	return Array.prototype.indexOf.call(uzlyTabulky, hledanyRadek);
}

function indexSloupecAktivniBunky() {
	let uzlyRadku = aktivniBunka.parentElement.parentElement.childNodes;
	let hledanaBunka = aktivniBunka.parentElement;

	return Array.prototype.indexOf.call(uzlyRadku, hledanaBunka);
}

function pridejRadekNahoru() {
	let novyRadek = vytvorRadek();
	let indexVybraneho = indexRadkuAktivniBunky();
	tabulka.insertBefore(novyRadek, tabulka.childNodes[indexVybraneho]);
}

function pridejRadekDolu() {
	let novyRadek = vytvorRadek();
	let indexVybraneho = indexRadkuAktivniBunky();
	if (tabulka.lastChild == tabulka.childNodes[indexVybraneho]) {
		tabulka.appendChild(novyRadek);
	} else {
		tabulka.insertBefore(novyRadek, tabulka.childNodes[indexVybraneho + 1]);
	}
}

window.onload = function () {
	vytvorOvladaciTlacitka();
	vytvorVychoziTabulku();
}