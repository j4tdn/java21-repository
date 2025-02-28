/*
======= DOM ELEMENTS =======
*/
let btnAdd = document.querySelector('.btn-add');
let textfield = document.querySelector('.todo-text');
let errorMessage = document.querySelector('.error-message');
let tasks = document.querySelector('.tasks');
let form = document.querySelector('.todo-form');
let checkboxes = document.querySelectorAll('.chx');





/*
======= PROCESSING LOGIC =======
*/

toggleErrorMessage(false);
toggleButton(false);

textfield.addEventListener('keyup', (e) => {
	let todoText = getText();
	firedTfKeyUpEvent(todoText);

	if (todoText && e.which === 13) {
		btnAdd.click();
	}
})


/* Trigger while clicking x symbol */
textfield.addEventListener('change', () => {
	let todoText = getText();
	firedTfKeyUpEvent(todoText);
});

btnAdd.addEventListener('click', function() {
	let todoText = getText();
	if (todoText) {
		tasks.appendChild(createNewTask(todoText));
		textfield.value = '';
	} else {
		toggleErrorMessage(true);
	}
	toggleButton(false);
});

/* Prevent reloading page when submit form */
form.addEventListener('submit', e => {
	e.preventDefault();
});

tasks.addEventListener('click', (e) => {
	let target = e.target;
	let classList = target.classList;
	let parent = target.parentElement;
	let task;

	if (classList.contains('cbx')) {
		task = parent.nextElementSibling;
		task.classList.toggle('task-done');
	} else if (classList.contains('btn-remove')) {
		task = target.previousElementSibling;
		let confirmed = confirm(`Are You sure to delete '${task.textContent}'' ?`);
		if (confirmed) {
			parent.remove();		
		}
	}
});



/*
======= UTIL METHODS =======
*/

function createNewTask(todoText) {
	let newTask = document.createElement('li');
	newTask.setAttribute('class', 'task');

	// div checkbox block
	let div = document.createElement('div');
	div.setAttribute('class', 'cbx-block');

	let input = document.createElement('input');
	input.setAttribute('type', 'checkbox');
	input.setAttribute('class', 'cbx');

	div.appendChild(input);

	// p text content
	let p = document.createElement('p');
	p.setAttribute('class', 'task-content');
	p.textContent = todoText;

	// button remove
	let button = document.createElement('button');
	button.setAttribute('class', 'btn-remove');

	newTask.appendChild(div);
	newTask.appendChild(p);
	newTask.appendChild(button);

	return newTask;

}

function getText() {
	return textfield.value.trim();
}

function firedTfKeyUpEvent(tfValue) {
	toggleButton(tfValue ? true : false);
	toggleErrorMessage(tfValue ? false : true);
}

function toggleButton(enable) {
	if (enable) {
		btnAdd.disabled = false;
	} else {
		btnAdd.disabled = true;
	}
}

function toggleErrorMessage(visible) {
	if (visible) {
		errorMessage.classList.remove('invisible');
	} else {
		errorMessage.classList.add('invisible');
	}
}