// Lấy các phần tử cần thiết từ DOM
const selectTransactionType = document.querySelector('select');
const descriptionInput = document.querySelector('input[type="text"]');
const valueInput = document.querySelector('input[type="number"]');
const budgetDisplay = document.querySelector('.total-budget');
const incomeValueDisplay = document.querySelector('.income-value');
const expenseValueDisplay = document.querySelector('.expense-value');

// Khởi tạo giá trị ban đầu
let income = 0;
let expenses = 0;

// Lắng nghe sự kiện khi người dùng nhấn nút "✔️"
document.querySelector('button').addEventListener('click', function () {
    // Lấy giá trị từ các input
    const description = descriptionInput.value.trim();
    const value = parseFloat(valueInput.value);

    // Kiểm tra nếu giá trị nhập vào hợp lệ
    if (!description || isNaN(value) || value <= 0) {
        alert("Vui lòng nhập mô tả và giá trị hợp lệ.");
        return;
    }

    // Kiểm tra loại giao dịch (thu nhập hay chi tiêu)
    if (selectTransactionType.value === '+') {
        // Cộng vào thu nhập
        income += value;
        incomeValueDisplay.textContent = `+ ${income.toFixed(2)}`;
    } else if (selectTransactionType.value === '-') {
        // Cộng vào chi tiêu
        expenses += value;
        expenseValueDisplay.innerHTML = `- ${expenses.toFixed(2)} <span class="percentage">(${getExpensePercentage()}%)</span>`;
    } else {
        alert("Vui lòng chọn loại giao dịch.");
        return;
    }

    // Cập nhật tổng ngân sách
    const totalBudget = income - expenses;
    budgetDisplay.textContent = `+ ${totalBudget.toFixed(2)}`;

    // Xóa giá trị nhập vào sau khi xử lý
    descriptionInput.value = '';
    valueInput.value = '';
    selectTransactionType.value = '';  // Reset lại chọn loại giao dịch
});

// Hàm tính tỷ lệ chi tiêu so với thu nhập
function getExpensePercentage() {
    if (income === 0) return 0;
    return ((expenses / income) * 100).toFixed(2);
}
