class Game {
    constructor() {
        this.score = 0;
        this.scoreDisplay = this.createScoreDisplay();
        this.balloonManager = new BalloonManager(this);
    }

    start() {
        this.balloonManager.start();
    }

    incrementScore() {
        this.score++;
        this.updateScoreDisplay();
    }

    updateScoreDisplay() {
        this.scoreDisplay.textContent = `You popped ${this.score} balloons`;
    }

    createScoreDisplay() {
        const display = document.createElement('div');
        display.classList.add('score-board');
        document.body.appendChild(display);
        return display;
    }
}

class Balloon {
    constructor(game) {
        this.game = game;
        this.element = document.createElement('div');
        this.element.classList.add('balloon');
        this.knot = this.createKnot();
        this.string = this.createString();
        this.element.appendChild(this.knot);
        this.element.appendChild(this.string);
        document.body.appendChild(this.element);
        this.initBalloon();
    }

    createKnot() {
        const knot = document.createElement('div');
        knot.classList.add('knot');
        return knot;
    }

    createString() {
        const string = document.createElement('div');
        string.classList.add('string');
        return string;
    }

    initBalloon() {
        const size = Math.random() * 30 + 60;
        const colors = ['red', 'yellow', 'purple', 'blue', 'green'];
        const color = colors[Math.floor(Math.random() * colors.length)];

        this.element.style.width = `${size}px`;
        this.element.style.height = `${size * 1.3}px`;
        this.element.style.backgroundColor = color;
        this.element.style.left = `${Math.random() * (window.innerWidth - size)}px`;

        const duration = Math.random() * 6 + 3;
        this.element.style.animation = `rise ${duration}s linear`;

        setTimeout(() => this.remove(), duration * 1000);
        this.element.addEventListener('click', () => this.pop());
    }

    pop() {
        this.game.incrementScore();
        this.element.style.transform = 'scale(0)';
        setTimeout(() => this.remove(), 200);
    }

    remove() {
        this.element.remove();
    }
}

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

document.addEventListener('DOMContentLoaded', () => {
    const game = new Game();
    game.start();
});
