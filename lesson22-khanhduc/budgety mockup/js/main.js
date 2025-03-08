document.querySelector(".budget-title-month").textContent =
  new Date().toLocaleString("default", { month: "long", year: "numeric" });

let totalIncome = 0;
let totalExpenses = 0;

document.getElementById("add-btn").addEventListener("click", function () {
  const type = document.getElementById("add-type").value;
  const description = document.getElementById("add-description").value.trim();
  const value = parseFloat(document.getElementById("add-value").value);

  if (description && !isNaN(value) && value > 0) {
    const list =
      type === "inc"
        ? document.getElementById("income-list")
        : document.getElementById("expenses-list");

    const newItem = document.createElement("div");
    newItem.classList.add("item");
    newItem.innerHTML = `
            ${description} <span class="item-value">${
      type === "inc" ? "+" : "-"
    } ${value.toFixed(2)}</span>
            <button class="delete-btn">X</button>
        `;
    list.appendChild(newItem);

    if (type === "inc") totalIncome += value;
    else totalExpenses += value;

    updateBudget();

    document.getElementById("add-description").value = "";
    document.getElementById("add-value").value = "";
  }
});

document
  .querySelector(".container")
  .addEventListener("click", function (event) {
    if (event.target.classList.contains("delete-btn")) {
      const item = event.target.parentElement;
      const amount = parseFloat(
        item.querySelector(".item-value").textContent.replace(/[^0-9.-]+/g, "")
      );

      if (item.parentElement.id === "income-list") totalIncome -= amount;
      else totalExpenses -= amount;

      item.remove();
      updateBudget();
    }
  });

function updateBudget() {
  const totalBudget = totalIncome - totalExpenses;
  document.getElementById("budget-total").textContent =
    (totalBudget >= 0 ? "+" : "-") + " " + Math.abs(totalBudget).toFixed(2);
  document.getElementById("budget-income").textContent =
    "+ " + totalIncome.toFixed(2);
  document.getElementById("budget-expenses").textContent =
    "- " + totalExpenses.toFixed(2);
  document.getElementById("budget-expenses-percentage").textContent =
    totalIncome > 0
      ? Math.round((totalExpenses / totalIncome) * 100) + "%"
      : "0%";
}
