let todoList = [];
let completedCount = 0;

document.getElementById("add-btn").addEventListener("click", addTodo);

// Add event listener for Enter key press
document.getElementById("todo-input").addEventListener("keydown", function(event) {
  if (event.key === "Enter") {
    addTodo();
  }
});

function addTodo() {
  const input = document.getElementById("todo-input");
  const todoText = input.value.trim();
  if (todoText === "") return;

  todoList.push({ text: todoText, completed: false });
  input.value = "";
  renderTodoList();
}

function renderTodoList() {
  const todoListElement = document.getElementById("todo-list");
  todoListElement.innerHTML = "";

  completedCount = 0;

  todoList.forEach((todo, index) => {
    const todoCard = document.createElement("div");
    todoCard.className = `todo-card ${todo.completed ? "completed" : ""}`;

    // Add a class specifically for the text
    const todoText = document.createElement("span");
    todoText.textContent = todo.text;
    todoText.className = "todo-text";

    const completeButton = document.createElement("button");
    completeButton.className = "complete-btn";
    completeButton.innerHTML = '<i class="fas fa-check"></i>';
    completeButton.addEventListener("click", () => toggleComplete(index));

    const deleteButton = document.createElement("button");
    deleteButton.className = "delete-btn";
    deleteButton.innerHTML = '<i class="fas fa-trash"></i>';
    deleteButton.addEventListener("click", () => deleteTodo(index));

    // Append elements in the correct order
    todoCard.appendChild(todoText);
    todoCard.appendChild(completeButton);
    todoCard.appendChild(deleteButton);
    todoListElement.appendChild(todoCard);

    if (todo.completed) completedCount++;
  });

  document.getElementById("completed-count").textContent = completedCount;
  document.getElementById("total-count").textContent = todoList.length;
}

function toggleComplete(index) {
  todoList[index].completed = !todoList[index].completed;
  renderTodoList();
}

function deleteTodo(index) {
  todoList.splice(index, 1);
  renderTodoList();
}