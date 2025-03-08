const shape = document.getElementById("shape");

document.getElementById("posX").addEventListener("input", (e) => {
            shape.style.left = e.target.value + "px";
        });

document.getElementById("posY").addEventListener("input", (e) => {
            shape.style.top = e.target.value + "px";
        });

document.getElementById("size").addEventListener("input", (e) => {
            shape.style.width = shape.style.height = e.target.value + "px";
        });

document.getElementById("opacity").addEventListener("input", (e) => {
            shape.style.opacity = e.target.value;
        });

document.getElementById("shapeBtn").addEventListener("click", () => {
    const shapeType = document.getElementById("shapeType").value;
    const shape = document.getElementById("shape");

            if (shapeType === "circle") {
                shape.style.borderRadius = "50%";
                shape.style.transform = "rotate(0deg)";
            } else if (shapeType === "rhombus") {
                shape.style.borderRadius = "0";
                shape.style.transform = "rotate(45deg)";
                shape.style.width = "100px"; // Đảm bảo chiều rộng phù hợp
                shape.style.height = "100px"; // Đảm bảo chiều cao phù hợp
            } else {
                shape.style.borderRadius = "0";
                shape.style.transform = "rotate(0deg)";
            }
        });

document.getElementById("hexColor").addEventListener("input", (e) => {
            shape.style.backgroundColor = e.target.value;
        });
        function updateRGBA() {
            const r = document.getElementById("red").value;
            const g = document.getElementById("green").value;
            const b = document.getElementById("blue").value;
            const a = document.getElementById("alpha").value;
            shape.style.backgroundColor = `rgba(${r}, ${g}, ${b}, ${a})`;
        }
        document.getElementById("red").addEventListener("input", updateRGBA);
        document.getElementById("green").addEventListener("input", updateRGBA);
        document.getElementById("blue").addEventListener("input", updateRGBA);
        document.getElementById("alpha").addEventListener("input", updateRGBA);