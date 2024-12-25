// let todoList = [];

document.addEventListener("DOMContentLoaded", fetchTasks);

function fetchTasks() {
  fetch("http://localhost:8080/api/tasks")
    .then((response) => response.json())
    .then((tasks) => {
      todoList = tasks;
      renderTodoList();
    })
    .catch((error) => console.error("Error fetching tasks:", error));
}


let completedCount = 0;

document.getElementById("add-btn").addEventListener("click", addTodo);

// Add event listener for Enter key press
document.getElementById("todo-input").addEventListener("keydown", function(event) {
  if (event.key === "Enter") {
    addTodo();
  }
});

// function addTodo() {
//   const input = document.getElementById("todo-input");
//   const todoText = input.value.trim();
//   if (todoText === "") return;

//   todoList.push({ text: todoText, completed: false });
//   input.value = "";
//   renderTodoList();
// }

function addTodo() {
  const input = document.getElementById("todo-input");
  const todoText = input.value.trim();
  if (todoText === "") return;

  const newTask = { text: todoText, completed: false };

  fetch("http://localhost:8080/api/tasks", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(newTask),
  })
    .then((response) => response.json())
    .then((task) => {
      todoList.push(task);
      input.value = "";
      renderTodoList();
    })
    .catch((error) => console.error("Error adding task:", error));
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

// function toggleComplete(index) {
//   todoList[index].completed = !todoList[index].completed;
//   renderTodoList();
// }

function toggleComplete(index) {
  const task = todoList[index];
  task.completed = !task.completed;

  fetch(`http://localhost:8080/api/tasks/${task.id}`, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(task),
  })
    .then((response) => response.json())
    .then(() => renderTodoList())
    .catch((error) => console.error("Error updating task:", error));
}


// function deleteTodo(index) {
//   todoList.splice(index, 1);
//   renderTodoList();
// }

function deleteTodo(index) {
  const task = todoList[index];

  fetch(`http://localhost:8080/api/tasks/${task.id}`, {
    method: "DELETE",
  })
    .then(() => {
      todoList.splice(index, 1);
      renderTodoList();
    })
    .catch((error) => console.error("Error deleting task:", error));
}
