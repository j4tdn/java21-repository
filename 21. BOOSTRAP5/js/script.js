const cwidthLabel = document.querySelector('.cwidth');

window.onload = function () {
	cwidthLabel.textContent = window.innerWidth;
}

window.onresize = function () {
	cwidthLabel.textContent = window.innerWidth;
}