const btnDisplay = document.querySelector(".btn-display");
const container = document.querySelector(".container");
const video = document.querySelector("video");

// bubbling: click con -> ăn luôn cha

btnDisplay.addEventListener("click", () => container.classList.remove("hidden"));

video.addEventListener("click", (e) => {
	e.stopPropagation(); // ngăn cản việc trigger other(parent) elements
	video.play();
});

container.addEventListener("click", () => container.classList.add("hidden"));