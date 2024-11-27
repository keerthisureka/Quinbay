// Only change code below this line
function countdown(n) {
  if (n < 1) {
    return [];
  } else {
    const arr = countdown(n-1);
    arr.unshift(n); // Adding to the front
    return arr;
  }
}
// Only change code above this line