document.addEventListener("DOMContentLoaded", function () {
    const square = document.getElementById("square");
    const posX = document.getElementById("posX");
    const posY = document.getElementById("posY");
    const size = document.getElementById("size");
    const opacity = document.getElementById("opacity");
    const shapeType = document.getElementById("shapeType");
    const applyShapeBtn = document.getElementById("applyShape");
    const hexColor = document.getElementById("hexColor");
    const applyHexBtn = document.getElementById("applyHex");

    const red = document.getElementById("red");
    const green = document.getElementById("green");
    const blue = document.getElementById("blue");
    const alpha = document.getElementById("alpha");

    const containerSize = 500;

    // Update Position X
    function updatePosX() {
        let newX = Math.min(posX.value, containerSize - square.offsetWidth);
        square.style.left = newX + "px";
    }

    // Update Position Y
    function updatePosY() {
        let newY = Math.min(posY.value, containerSize - square.offsetHeight);
        square.style.top = (containerSize - newY - square.offsetHeight) + "px";
    }

    // Update Size
    function updateSize() {
        let newSize = size.value + "px";
        square.style.width = newSize;
        square.style.height = newSize;
    }

    // Update Opacity
    function updateOpacity() {
        square.style.opacity = opacity.value;
    }

    // Apply Shape
    function applyShape() {
        const selectedShape = shapeType.value;

        switch (selectedShape) {
            case "square":
                square.style.borderRadius = "0";
                square.style.transform = "rotate(0deg)";
                break;
            case "circle":
                square.style.borderRadius = "50%";
                square.style.transform = "rotate(0deg)";
                break;
            case "rhombus":
                square.style.borderRadius = "0";
                square.style.transform = "rotate(45deg)";
                break;
        }
    }

    // Apply HEX Color
    function applyHexColor() {
        const hexValue = hexColor.value.trim();
        if (/^#([0-9A-Fa-f]{3}){1,2}$/.test(hexValue)) {
            square.style.backgroundColor = hexValue;
        } else {
            alert("Vui lòng nhập mã màu HEX hợp lệ!");
        }
    }

    // Update RGBA Color
    function updateRGBAColor() {
        const r = red.value;
        const g = green.value;
        const b = blue.value;
        const a = alpha.value;
        square.style.backgroundColor = `rgba(${r}, ${g}, ${b}, ${a})`;
    }

    // Event Listeners
    posX.addEventListener("input", updatePosX);
    posY.addEventListener("input", updatePosY);
    size.addEventListener("input", updateSize);
    opacity.addEventListener("input", updateOpacity);
    applyShapeBtn.addEventListener("click", applyShape);
    applyHexBtn.addEventListener("click", applyHexColor);

    red.addEventListener("input", updateRGBAColor);
    green.addEventListener("input", updateRGBAColor);
    blue.addEventListener("input", updateRGBAColor);
    alpha.addEventListener("input", updateRGBAColor);

    console.log("Script loaded successfully!");
});
