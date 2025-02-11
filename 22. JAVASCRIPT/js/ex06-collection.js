/*
   Array -- List
   Set
   Map

   Java: ArrayList, LinkedList implement List
         --> inhertance & override

   JavaScript: Array
         --> composition

    A extends B
    A
      B           
*/

Array.prototype.add = function(index, newValue) {
	this.splice(index, 0, newValue);
}

Array.prototype.add = function(newValue) {
	this.push(newValue);
}

Array.prototype.remove = function(value) {
	let index = this.indexOf(value);
	this.splice(index, 1);
}

let words = ['A', 'B', 'C', 'D', 'E'];

// THÊM
words.unshift('1st'); 
words.push('nth');
words.splice(3, 0, 'Middle', 'Btw');
words.add(4, 'TestNewProto');
words.add('End');


// XÓA
words.remove('D');


console.log(words);