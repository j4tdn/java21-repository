let tasks = document.querySelector('.tasks');

tasks.appendChild(createTask('li', 'Task 04: Do Logic page'));
tasks.children[2].remove();

let pos = tasks.children[1];
tasks.insertBefore(createTask('li', 'Task 8: Do Homework'), pos);


function createTask(tagName, content) {
	let newTask = document.createElement(tagName);
	newTask.textContent = content;
	newTask.style.color = randomColor();
	return newTask;
}
