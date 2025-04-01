
// creatingTime: Chu kỳ tạo ra một balloon mới
// runningTime: Chu kỳ dịch chuyển balloon lên 1p
// totalScore: số điểm cần đạt cho level hiện tại
function BallGameDto(creatingTime, runningTime, totalScore) {
	this.creatingTime = creatingTime;
	this.runningTime = runningTime;
	this.totalScore = totalScore;
}

let levels = new Map();
levels.set(1, new BallGameDto(600, 10, 4));
levels.set(2, new BallGameDto(500, 8, 8));
// levels.set(3, new BallGameDto(400, 6, 12));
// levels.set(4, new BallGameDto(300, 4, 16));


