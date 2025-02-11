"use strict";

console.log('--- Data Structure ---');

console.log('**********************');

var pTest = 2025;
console.log('pTest T1 --> ' + pTest);
console.log('pTest T1(runtime) --> ' + (typeof pTest));

console.log('**********************');

pTest = "Happy New Year";
console.log('pTest T2 --> ' + pTest);
console.log('pTest T2(runtime) --> ' + (typeof pTest));

console.log('**********************');

pTest = true;
console.log('pTest T3 --> ' + pTest);
console.log('pTest T3(runtime) --> ' + (typeof pTest));

console.log('**********************');

pTest = null;
console.log('pTest T4 --> ' + pTest);
console.log('pTest T4(runtime) --> ' + (typeof pTest));

console.log('**********************');

pTest = new Date();
console.log('pTest T5 --> ' + pTest);
console.log('pTest T5(runtime) --> ' + (typeof pTest));

/* Custom Object Type */

console.log('**********************');

/*Ideal: Json(Anonymous class)*/
pTest = {
	id: 8612,
	name: 'Item A86',
	salesPrice: 22,

	toString: function() {
		return this.id + ', ' + this.name + ', ' + this.salesPrice;
	}
}

console.log('pTest T6 --> ' + pTest.toString());
console.log('pTest T6(runtime) --> ' + (typeof pTest));

/* Declaration New Class */

class Store {

	/* attributes */
	openningTime;
	closingTime;

	constructor(openningTime, closingTime) {
		this.openningTime = openningTime;
		this.closingTime = closingTime;
	}

	intro() {
		return this.openningTime + "H - " + this.closingTime + 'H';
	}
}

console.log('**********************');

pTest = new Store(8, 12);
console.log('pTest T7 --> ' + pTest.intro());
console.log('pTest T7(runtime) --> ' + (typeof pTest));


console.log('**********************');

/*function expression*/
pTest = function(a, b) {
	return a + b;
}

console.log('pTest T8(a+b) --> ' + pTest(1, 2));
console.log('pTest T8(runtime) --> ' + (typeof pTest));

