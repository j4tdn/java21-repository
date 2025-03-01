let wTag = document.getElementById('welcome');
let fTag = document.getElementsByClassName('fname');
let aTag = document.getElementsByName('age');
let pTag = document.getElementsByTagName('p');

console.log(wTag);
console.log(fTag);
console.log(aTag);
console.log(pTag);

wTag.style.color = 'green';

// let wQTag = document.querySelector('*[id="welcome"]');
let wQTag = document.querySelector('#welcome');
wQTag.style.color = 'purple';

let sdTags = document.querySelectorAll('.desc');
sdTags.forEach(sdTag => sdTag.style.textTransform = 'uppercase');