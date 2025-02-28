function randomColor() {
	return `rgb(${random(256)}, ${random(256)}, ${random(256)})`;
}

function random(endExclusive) {
	return Math.floor(Math.random() * endExclusive);
}