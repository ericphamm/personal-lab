document.addEventListener("DOMContentLoaded", function() {
	// let elements = document.getElementsByClassName("important");
	// for (let i = 0; i < elements.length; i++) {
	// 	console.log(elements[i]);
	// }

	// let paragraphs = document.getElementsByTagName("p");
	// for (let i = 0; i < paragraphs.length; i++) {
	// 	console.log(paragraphs[i]);
	// }

	let title = document.querySelector("#greeting");
	let text = document.querySelector(".important");
	let picture = document.querySelector('[src="img/pastry.jpg"]');
	let photo = document.querySelector("logo");
	let spans = document.querySelectorAll("span");

	console.log(title);
	console.log(text);
	console.log(picture);
	console.log(photo);

	for (let i = 0; i < spans.length; i++) {
		console.log(spans[i]);
	}

	// let paragraph = document.querySelectorAll("p");
	// for (let i = 0; i < spans.length; i++) {
	// 	paragraph[1]  = "Dnes mame v nabidce";
	// }
	// paragraph.textContent = "Dnes mame v nabidce";

	let hiddenText = document.querySelectorAll("p");
	console.log(hiddenText[1].innerText);
	console.log(hiddenText[1].textContent);

	let products = document.querySelectorAll("li");
	products[4].innerHTML = "<s>DORTY</s>"

	let logoImage = document.querySelector("#logo");
	console.log(logoImage.hasAttribute("alt"));

	let image = document.querySelector('[src="img/pastry.jpg"]');
	image.setAttribute("alt","Chleb");
	console.log(image.hasAttribute("alt"));
});