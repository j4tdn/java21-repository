// Điều khiển trò chơi
class Game {
    constructor() {
        this.balloonManager = new BalloonManager(this);
        this.score = 0;

        // Tạo bảng điểm
        this.scoreDisplay = document.createElement("div");
        this.scoreDisplay.classList.add("score-board");
        this.updateScoreDisplay();
        document.body.appendChild(this.scoreDisplay);
    }

    start() {
        this.balloonManager.start();
    }

    incrementScore() {
        this.score++;
        this.updateScoreDisplay();
    }

    updateScoreDisplay() {
        this.scoreDisplay.innerText = `You popped ${this.score} balloons`;
    }
}

// Class tạo bong bóng
class Balloon {
    constructor(game) {
        this.game = game;
        this.element = document.createElement("div");
        this.element.classList.add("balloon");

        this.knot = document.createElement("div");
        this.knot.classList.add("knot");

        this.string = document.createElement("div");
        this.string.classList.add("string");

        this.element.appendChild(this.knot);
        this.element.appendChild(this.string);
        document.body.appendChild(this.element);

        this.initBalloon();
    }

    initBalloon() {
        const size = Math.random() * 30 + 60;
        const colors = ["red", "yellow", "purple", "blue", "green"];

        this.element.style.width = `${size}px`;
        this.element.style.height = `${size * 1.3}px`;
        this.element.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];
        this.element.style.left = `${Math.random() * (window.innerWidth - size)}px`;

        const duration = Math.random() * 6 + 3;
        this.element.style.animation = `rise ${duration}s linear`;

        setTimeout(() => this.remove(), duration * 1000);

        this.element.addEventListener("click", () => this.pop());
    }

    pop() {
        this.game.incrementScore(); // Tăng điểm khi bấm vào bóng
        this.element.style.transform = "scale(0)";
        setTimeout(() => this.remove(), 200);
    }

    remove() {
        this.element.remove();
    }
}

// Quản lý tạo bong bóng
class BalloonManager {
    constructor(game, interval = 800) {
        this.game = game;
        this.interval = interval;
        this.timer = null;
    }

    start() {
        this.timer = setInterval(() => this.createBalloon(), this.interval);
    }

    stop() {
        clearInterval(this.timer);
    }

    createBalloon() {
        new Balloon(this.game);
    }
}

// Khởi động trò chơi
const game = new Game();
game.start();
