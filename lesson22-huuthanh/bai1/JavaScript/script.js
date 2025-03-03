document.addEventListener("DOMContentLoaded", function () {
    const square = document.getElementById("square");
    if (square) {
        console.log("Hình vuông đã được tạo thành công!");
    } else {
        console.error("Không tìm thấy phần tử hình vuông!");
    }
});



document.addEventListener("DOMContentLoaded", function () {
    const square = document.getElementById("square");
    const posX = document.getElementById("posX");
    const posY = document.getElementById("posY");
    const size = document.getElementById("size");
    const opacity = document.getElementById("opacity");
    const shapeType = document.getElementById( "shapeType");
    const applyShapeBtn = document.getElementById("applyShape");
    const hexColor = document.getElementById("hexColor");
    const applyHexBtn = document.getElementById("applyHex");

    
    const red = document.getElementById("red");
    const green = document.getElementById("green");
    const blue = document.getElementById("blue");
    const alpha = document.getElementById("alpha");

    const containerSize = 500;

    
    posX.addEventListener("input", function () {
        let newX = Math.min(posX.value, containerSize - square.offsetWidth);
        square.style.left = newX + "px";
    });

    
    posY.addEventListener("input", function () {
        let newY = Math.min(posY.value, containerSize - square.offsetHeight);
        square.style.top = (containerSize - newY - square.offsetHeight) + "px";
    });

    
    size.addEventListener("input", function () {
        let newSize = size.value + "px";
        square.style.width = newSize;
        square.style.height = newSize;
    });

   
    opacity.addEventListener("input", function () {
        square.style.opacity = opacity.value;
    });

   
    applyShapeBtn.addEventListener("click", function () {
        const selectedShape = shapeType.value;

        if (selectedShape === "square") {
            square.style.borderRadius = "0";
            square.style.transform = "rotate(0deg)";
        } else if (selectedShape === "circle") {
            square.style.borderRadius = "50%";
            square.style.transform = "rotate(0deg)";
        } else if (selectedShape === "rhombus") {
            square.style.borderRadius = "0";
            square.style.transform = "rotate(45deg)";
        }
    });

   
    applyHexBtn.addEventListener("click", function () {
        const hexValue = hexColor.value.trim();
        if (/^#([0-9A-Fa-f]{3}){1,2}$/.test(hexValue)) {
            square.style.backgroundColor = hexValue;
        } else {
            alert("Vui lòng nhập mã màu HEX hợp lệ!");
        }
    });

    
    function updateRGBAColor() {
        const r = red.value;
        const g = green.value;
        const b = blue.value;
        const a = alpha.value;
        square.style.backgroundColor = `rgba(${r}, ${g}, ${b}, ${a})`;
    }

    red.addEventListener("input", updateRGBAColor);
    green.addEventListener("input", updateRGBAColor);
    blue.addEventListener("input", updateRGBAColor);
    alpha.addEventListener("input", updateRGBAColor);

    console.log("Script loaded successfully!");
});







