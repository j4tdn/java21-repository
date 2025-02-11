/*
var: function scope
let: block scope
const: block scope, final at stack
*/

(() => {
	
	{
		var v1 = 'v1';
		var v2 = 'v2';

		let l1 = 'l1';
		let l2 = 'l2';

		console.log(`inner let --> ${l1} ${l2}`);
		console.log(`inner var --> ${v1} ${v2}`);
	}

	console.log(`outer var --> ${v1} ${v2}`);
})();


/*
  hoisting: works with
  --> use var, function before declaration

  - declaration function
  - global variable (var scope)	

*/

console.log('sum --> ' + sum(1, 2));
function sum(a, b) {
	return a + b;
}

// discourage
text = 'word';

// var text;

console.log('text --> ' + text);