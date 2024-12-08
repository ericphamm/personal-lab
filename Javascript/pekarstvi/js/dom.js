document.addEventListener("DOMContentLoaded", function() {
	// let elements = document.getElementsByClassName("important");
	// for (let i = 0; i < elements.length; i++) {
	// 	console.log(elements[i]);
	// }

	// let paragraphs = document.getElementsByTagName("p");
	// for (let i = 0; i < paragraphs.length; i++) {
	// 	console.log(paragraphs[i]);
	// }

	// let title = document.querySelector("#greeting");
	// let text = document.querySelector(".important");
	// let picture = document.querySelector('[src="img/pastry.jpg"]');
	// let photo = document.querySelector("logo");
	// let spans = document.querySelectorAll("span");

	// console.log(title);
	// console.log(text);
	// console.log(picture);
	// console.log(photo);

	// for (let i = 0; i < spans.length; i++) {
	// 	console.log(spans[i]);
	// }

	// let paragraph = document.querySelectorAll("p");
	// for (let i = 0; i < spans.length; i++) {
	// 	paragraph[1]  = "Dnes mame v nabidce";
	// }
	// paragraph.textContent = "Dnes mame v nabidce";

	// let hiddenText = document.querySelectorAll("p");
	// console.log(hiddenText[1].innerText);
	// console.log(hiddenText[1].textContent);

	// let products = document.querySelectorAll("li");
	// products[4].innerHTML = "<s>DORTY</s>"

	// let logoImage = document.querySelector("#logo");
	// console.log(logoImage.hasAttribute("alt"));

	// let image = document.querySelector('[src="img/pastry.jpg"]');
	// image.setAttribute("alt","Chleb");
	// console.log(image.hasAttribute("alt"));

	// let menu = document.querySelector("li");
	// menu.setAttribute("class", "important");

	// let headerElements = document.querySelector('header');
	// console.log(headerElements.lastElementChild);

	let paragraph = document.createElement("div");
	paragraph.textContent = "Kazdy den po 16:00 poskytujeme na veskery sortiment 50% slevu";
	let parent = document.getElementById("info");
	parent.appendChild(paragraph);

	document.body.appendChild(paragraph);

	let heading = document.createElement("h2");
	heading.innerText = "Aktuality";
	
	let element = document.getElementsByTagName("div");
	document.body.insertBefore(heading,element[0]);

	let styleHeading = document.querySelector("h2");
	styleHeading.setAttribute("class","important");

	let newParagraph = document.createElement("p");
	let strongElement = document.createElement("strong");
	strongElement.textContent = "Novinky z nasi pekarny";
	newParagraph.appendChild(strongElement);
	document.body.replaceChild(newParagraph,heading);
	newParagraph.removeChild(strongElement);
});