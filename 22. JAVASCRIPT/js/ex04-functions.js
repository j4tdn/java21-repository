// 1st: function constructor
var sum = new Function('a', 'b', 'return a + b');
console.log(`sum --> ${sum(2, 4)}`);



// 2nd: function declaration
//    : can be called before declaration(hoisting)
function sub(a, b) {
	return a - b;
}
console.log(`sub --> ${sub(12, 2)}`);



// 3rd: function expression(anonymous)
var mul = function(a, b) {
	return a * b;
}
console.log(`mul --> ${mul(12, 2)}`);


// 4th: function arrow
var div = (a, b) => {
	var initial = 8;
	return (a / b) + initial;
}
console.log(`div --> ${div(12, 2)}`);



// 5th: method
var item = {
	id: 10,
	name: 'John',

	export: function() {
		console.log(`${this.name} has id = ${this.id}`);
	}
}
item.export();



// 6th: function iffe(immediate invoked function expression)
(function() {
	console.log('logging foo data 1');
})();

void function() {
	console.log('logging foo data 2');
}();

(function(result) {
	console.log('result --> ' + result);
})('---');



// 7th: function nested
function test(number) {

	function isEven(nb) {
		return nb % 2 == 0; 
	}

	function log(text) {
		console.log('test#log --> ' + text);
	}

	var result = isEven(number) && number > 10;

	return log(result);
}

test(7);




// 8th: callback function
function filter(elements, test) {
	var target = [];
	for (var element of elements) {
		if (test(element)) {
			target.push(element);
		}
	}
	return target;
}

var numbers = [1, 2, 3, 4, 5, 6];


var result = filter(numbers, nb => nb % 2 != 0);
console.log(`callback filter --> ${result}`);


