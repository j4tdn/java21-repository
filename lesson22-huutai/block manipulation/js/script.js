let box = document.querySelector('#box');
let xPos = document.querySelector('#xPos');
let yPos = document.querySelector('#yPos');
let size = document.querySelector('#size');
let opacity = document.querySelector('#opacity');
let shapeType = document.querySelector('#shapeType');
let rC = document.querySelector('#rColor');
let gC = document.querySelector('#gColor');
let bC = document.querySelector('#bColor');

xPos.addEventListener('input', (e) => {
	box.style.left = e.target.value + 'px';
});

yPos.addEventListener('input', (e) => {
	box.style.top = e.target.value + 'px';
});

size.addEventListener('input', (e) => {
	box.style.width = e.target.value + 'px';
	box.style.height = e.target.value + 'px';
});

opacity.addEventListener('input', (e) => {
	box.style.opacity = e.target.value;
});

shapeType.addEventListener('change', (e) => {
	box.style.borderRadius = e.target.value === 'circle' ? '50%' : '0%';
});

rC.addEventListener('input', (e) => {
	box.style.backgroundColor = `rgb(${rC.value}, ${gC.value}, ${bC.value})`;
});

gC.addEventListener('input', (e) => {
	box.style.backgroundColor = `rgb(${rC.value}, ${gC.value}, ${bC.value})`;
});

bC.addEventListener('input', (e) => {
	box.style.backgroundColor = `rgb(${rC.value}, ${gC.value}, ${bC.value})`;
});