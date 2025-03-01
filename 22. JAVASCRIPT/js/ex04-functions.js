// 1st: Function Constructor
var sum = new Function('a', 'b', 'return a + b');
console.log(`sum --> ${sum(4, 8)}`);

// 2nd: Function Declaration
//    : can be called before declaration(hoisting)
function sub(a, b){
	return a - b;
}
console.log(`sub --> ${sub(22, 9)}`);	

// 3rd: Function Expression(Anonymous)
var mul = function(a, b){
	return a * b;
}
console.log(`sub --> ${mul(4, 8)}`);

// 4th: Function Arrow
var div = (a, b) => {
	var initial = 8;

	return (a / b) + initial;
}
console.log(`div --> ${div(12, 6)}`);

// 5th: Method
var item = {
	id: 10,
	name: 'John',

	export: function(){
		console.log(`${this.name} has id = ${this.id}`)
	}
}
item.export();

// 6th: Function Iffe(immediate invoked function expression)
(function(){
	console.log('logging foo data 1');
})();

void function(){
	console.log('logging foo data 2');
}();

(function(result) {
	console.log('result --> ' + result);
}('---'));

// 7th: Function Nested
function test(number){

	function isEven(nb){
		return nb % 2 == 0;
	}

	function log(text){
		console.log('test#log -->' + text)
	}

	var result = isEven(number) && number > 10;

	return log(result);
}	
test(7);

// 8th: callback function
function filter(elements, test){
	var target = [];
	for (var element of elements){
		if (test(element)){
			target.push(element);
		}
	}
	return target;
}	

var numbers = [1, 2, 3, 4 ,5, 6];

var result = filter(numbers, function(nb){
	return nb % 2 != 0;
});
console.log(`callback filter --> ${result}`);