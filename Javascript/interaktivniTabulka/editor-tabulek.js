let tabulka;
let sloupcu = 5;
let radku = 3;
let aktivniBunka;

function vyvtvorVychoziTabulku() {
	tabulka = document.createElement("table");
	document.body.appendChild(tabulka);

	for(let y = 0; y < radku; y++) {
		let tr = document.createElement("tr");
		tabulka.appendChild(tr);

		for(let x = 0; x < sloupcu; x++) {
			tr.appendChild(vytvorBunku());
		}
	}
}

function vytvorBunku() {
	let td = document.createElement("td");
	let tdInput = document.createElement("input");
	tdInput.type = "text";
	tdInput.onfocus = function() {
		aktivniBunka.this;
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
	vytvorTlacitko("Přidat řádek dolů");
	vytvorTlacitko("Přidat řádek nahoru");
	vytvorTlacitko("Přidat sloupec vlevo");
	vytvorTlacitko("Přidat sloupec vpravo");
	vytvorTlacitko("Odstranit řádek");
	vytvorTlacitko("Odstranit sloupec");
}

let prvniRadek = tabulka.firstElementChild;
let bunkyPrvnihoRadku = prvniRadek.querySelectorAll("td");
let pocetBunekVPrvnimRadku = bunkyPrvnihoRadku.length;

function vytvorRadek() {
	let novyRadek = document.createElement("tr");
	let pocetBunekVPrvnimRadku = tabulka.firstElementChild.querySelectorAll("td").length;

	for (let i = 0; i < pocetBunekVPrvnimRadku; i++) {
		novyRadek.appendChild(vytvorBunku());
	}
	return novyRadek;
}

window.onload = function () {
	vytvorOvladaciTlacitka();
	vyvtvorVychoziTabulku();
}
