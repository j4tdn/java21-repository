let audio = new Audio('sounds/pop.mp3');

let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

let body = document.body;
let wlContainer = document.querySelector('.wl-container');
let winBlock = document.querySelector('.w-block');
let loseBlock = document.querySelector('.l-block');
let btnYes = document.querySelector('.play-again-yes');
let btnNo = document.querySelector('.play-again-no');
let btnNextLevel = document.querySelector('.play-next-level');

let nextLevelBlock = document.querySelector('.next-level-block');
let nextLevelLabel = document.querySelector('.next-level');
let championButton = document.querySelector('.champion');

let totalScoreLabel = document.querySelector('.total-score');
let currentScoreLabels = document.querySelectorAll('.current-score');

let windowWidth = window.innerWidth;
let windowHeight = window.innerHeight;

const balloonWidth = 100;
const balloonHeight = 200;

let currentScore = 0;
let currentLevel = 1;

const wlEnum = Object.freeze({
	WIN: 1,
	LOSE: 0
});

let endGame = false; // kết thúc game thắng
let gameOver = false; // kết thúc game thua

let balloonId = 1

startGame(currentLevel);

function startGame(level) {
	let ballGameDto = levels.get(level);

	// Gán điểm chiến thắng cho game lúc bắt đầu
	totalScoreLabel.textContent = ballGameDto.totalScore;

	// Balloon sẽ được khởi tạo sau một khoảng thời gian
	let interval = setInterval(() => {
		if (finishedGame()) {
			clearInterval(interval);
			showWlContainer(endGame ? wlEnum.WIN : wlEnum.LOSE);
		} else {
			createBall(ballGameDto.runningTime, ballGameDto.totalScore);
		}
		
	}, ballGameDto.creatingTime);
}


function createBall(runningTime, totalScore) {
	let balloon = document.createElement('div');
	balloon.id = balloonId++;
	
	let color = colors[random(colors.length)];
	balloon.className = `balloon balloon-${color}`;

	let leftPos = random(windowWidth - balloonWidth + 1);
	balloon.style.left = leftPos + 'px';

	// Xử lý xự kiện khi click vào baloon
	balloon.addEventListener('click', () => {
		if (!finishedGame()) {
			audio.play();
			balloon.remove();
			updateCurrentScoreLabels(++currentScore);

			// == Xử lý thắng ==
			if (currentScore === totalScore) {
				endGame = true;
				nextLevelLabel.textContent = ++currentLevel;
				// Các balloon đã tạo vẫn cho di chuyển, tắt chức năng click
				// Không tạo ra balloon mới nữa
			}
		}
		
	});

	body.appendChild(balloon);

	runningBall(balloon, runningTime);
}

/*
Sau khi quả bóng được tạo ra, cho nó dịch chuyển từ dưới lên
Ý tưởng: Sử dụng setInterval để quy ước sau bao lâu quả bóng sẽ dịch chuyển lên 1px
*/
function runningBall(balloon, runningTime) {
	let moved = 0;
	let interval = setInterval(() => {
		// Kiểm tra nếu balloon đã bị remove khỏi DOM(UI) -> không cho running nữa
		let isExisting = document.querySelector('div[id="' + balloon.id + '"]') !== null;
		if (isExisting) {
			if (moved === windowHeight + balloonHeight + 1) {
				clearInterval(interval);
				balloon.remove();

				// == Xử lý thua ==
				gameOver = true;
			} else {
				balloon.style.top = (windowHeight - moved) + 'px';
				moved++;
			}
		}
	}, runningTime);
}

function updateCurrentScoreLabels(currentScore) {
	currentScoreLabels.forEach(label => {
		label.textContent = currentScore;
	});
}

function hideWlContainer() {
	wlContainer.style.display = 'none';
	winBlock.style.display = 'none';
	loseBlock.style.display = 'none';
}

function showWlContainer(wlOption) {
	wlContainer.style.display = 'flex';

	if (wlOption === wlEnum.WIN) {
		winBlock.style.display = 'block';
		loseBlock.style.display = 'none';

		let hasNextLevel = !!levels.get(currentLevel);
		
		if (hasNextLevel) {
			nextLevelBlock.style.display = 'block';
			championButton.style.display = 'none';
		} else {
			nextLevelBlock.style.display = 'none';
			championButton.style.display = 'block';
		}

	} else {
		winBlock.style.display = 'none';
		loseBlock.style.display = 'block';
	}
}

function removeRemainingBalloonsForNewGame() {
	let balloons = document.querySelectorAll('.balloon');
	balloons.forEach(balloon => {
		balloon.remove();
	});
}

function finishedGame() {
	return endGame || gameOver;
}

/*
======================== EVENT HANDLERS ========================
*/

function gaming() {
	hideWlContainer();
	removeRemainingBalloonsForNewGame();
	updateCurrentScoreLabels(currentScore = 0)
	startGame(currentLevel); // play again cho level hiện tại, reset về 0 ?
}

btnNextLevel.addEventListener('click', () => {
	endGame = false;
	gaming();
});

btnYes.addEventListener('click', () => {
	gameOver = false;
	gaming();
});

btnNo.addEventListener('click', () => {
	hideWlContainer();
});

/*
======================== UTIL METHODS ========================
*/

function random(bound) {
	return Math.floor(Math.random() * bound);
}