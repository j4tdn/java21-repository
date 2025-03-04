let availableBudget = 0;
        let income = 0;
        let expenses = 0;

        function addTransaction() {
            const type = document.getElementById('type').value;
            const description = document.getElementById('description').value;
            const amount = parseFloat(document.getElementById('amount').value);

            if (description && amount) {
                if (type === 'income') {
                    income += amount;
                } else {
                    expenses += amount;
                }
                availableBudget = income - expenses;

                const transactionItem = document.createElement('div');
                transactionItem.className = `transaction-item ${type}`;
                transactionItem.innerHTML = `
                    <span>${description}</span>
                    <span>${amount.toLocaleString()} VND</span>
                `;
                document.getElementById('transactions-list').appendChild(transactionItem);
                document.getElementById('available-budget').innerText = availableBudget.toLocaleString();
                document.getElementById('income').innerText = income.toLocaleString();
                document.getElementById('expenses').innerText = expenses.toLocaleString();
                document.getElementById('description').value = '';
                document.getElementById('amount').value = '';
            }
        }