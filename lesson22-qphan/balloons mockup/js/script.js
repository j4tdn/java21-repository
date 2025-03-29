let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

let body = document.body;

let windowWidth = window.innerWidth;
let windowHeight = window.innerHeight;

let balloonWidth = 100;


startGame();

function startGame() {
	/*Balloon sẽ được khởi tạo sau một khoảng thời gian*/
	setInterval(() => {
		createBall();
	}, 500);
}


function createBall() {
	let balloon = document.createElement('div');
	
	let color = colors[random(colors.length)];
	balloon.className = `balloon balloon-${color}`;

	let leftPos = random(windowWidth - balloonWidth + 1);
	balloon.style.left = leftPos + 'px';

	body.appendChild(balloon);

	running(balloon);
}

/*
Sau khi quả bóng được tạo ra, cho nó dịch chuyển từ dưới lên
Ý tưởng: Sử dụng setInterval để quy ước sau bao lâu quả bóng sẽ dịch chuyển lên 1px
*/
function running(balloon) {
	let moved = 0;
	let interval = setInterval(() => {
		if (moved === windowHeight + 200) {
			clearInterval(interval);
			balloon.remove();
		}
		balloon.style.top = (windowHeight - moved) + 'px';
		moved ++;
	}, 10)
}

/*
======================== UTIL METHODS ========================
*/

function random(bound) {
	return Math.floor(Math.random() * bound);
}