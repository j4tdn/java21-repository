let clickMe = document.querySelector('.clickme');

clickMe.onclick = function(){
	console.log('onclick: task 01');
}

clickMe.onclick = function(){
	console.log('onclick: task 02');
}

clickMe.addEventListener('click', function(){
	console.log('addEventListener(click): task 01');
});

clickMe.addEventListener('click', function(){
	console.log('addEventListener(click): task 02');
});

// Yêu cầu 1: Khi nhấn vào button bên trong container
// --> đổi màu button đó, sử dụng màu random

let container = document.querySelector('.container');
container.addEventListener('click', function(event){
	// trả về element thật sự đang thao tác
	let target = event.target;
	let targetClassList = event.target.classList.value;
	if (targetClassList.startsWith('bt')){
		target.style.background = randomColor();
	}
});

// Yêu cầu 2: Validate cho fname, lname
//            Phạm vi [8, 30] kí tự

let fname = document.querySelector('#fname');
let fnameError = document.querySelector('.fname-error');

let lname = document.querySelector('#lname');
let lnameError = document.querySelector('.lname-error');

let submitButton = document.querySelector('#submit');

fname.addEventListener('keyup', () => {
	let isValid = validateLength(fname, 8, 30);
	if (isValid){
		fnameError.style.display = 'none';
		if (validateLength(lname, 8, 30)){
			submitButton.disabled = false;
		} else {
			submitButton.disabled = true;
		}
	} else {
		fnameError.style.display = 'inline';
		fnameError.textContent  = 'Length is invalid, required [8, 30] letters';
		submitButton.disabled = true;
	}
});

lname.addEventListener('keyup', () => {
	let isValid = validateLength(lname, 8, 30);
	if (isValid){
		lnameError.style.display = 'none';
		if (validateLength(fname, 8, 30)){
			submitButton.disabled = false;
		} else {
			submitButton.disabled = true;
		}
	} else {
		lnameError.style.display = 'inline';
		lnameError.textContent  = 'Length is invalid, required [8, 30] letters';
		submitButton.disabled = true;
	}
});

let ffill = document.querySelector('#ffill');
ffill.addEventListener('submit', (e) => {
	e.preventDefault();
	document.querySelector('.success').textContent = fname.value + ' ' + lname.value;
});

function validateAllInputFields(){
	// replace for validateLength for other fields
}

function validateLength(field, minInc, maxInc) {
	let value = field.value;
	return value.length >= minInc && value.length <= maxInc;
}
