// create object via anonymous object
let anomousObject = {
	id: 162781,
	name: 'Teo Le',
	dateOfBirth: new Date(1234567),

	toString: function() {
		console.log('AnomousObject: toString(' + this.id + ', ' + this.name + ', ' + this.dateOfBirth + ')');
	}
}

anomousObject.toString();


// create object via function
function Store(id, name, amountOfItems) {
	this.id = id;
	this.name = name;
	this.amountOfItems = amountOfItems;

	this.toString = function() {
		console.log(`Store: toString(${this.id}, ${this.name}, ${this.amountOfItems})`);
	};
}

let s1 = new Store(101, 'Store 101', 2000);
s1.toString();

class Person {
	constructor(name) {
		this.name = name;
	}

	toString() {
		return 'Person: toString(' + this.name + ')';
	}
}

class Student extends Person{
	#grade; // required to declare private attribute

	constructor(name, grade) {
		super(name);
		this.#grade = grade;
	}

	toString() {
		return 'Student: toString(' + this.name + ', ' + this.#grade + ')';
	}
}

let person = new Person('Teo');
let student = new Student('Teo', '10A2');
student.grade = '12A2';

console.log('Person --> ' + person.toString());
console.log('Student --> ' + student.toString());

console.log(student);


