"use strict";

console.log('--- Data Structure ---');

console.log('**********************');

alert('Hello USER, Tests whether are you a BOT ?');

const min = 5;
const max = 20;

var fullname = prompt('Fill your name ?');

if (!!fullname) {
	var a = rand(min, max);
	var b = rand(min, max);
	var enteringValue = +prompt(`Hey ${fullname}, submit result of (${a} + ${b}) = ?`);

	if (enteringValue === (a + b)) {
		if (confirm('Click Yes to enter the page')){
			window.location.href = 'https://github.com/j4tdn/java21-repository';
		}
	} else {
		console.log('Wrong result ...');
	}
}

/* function declaration */
function rand(startIncl, endExcl) {
	return Math.floor(startIncl + Math.random()*(endExcl - startIncl));
}
