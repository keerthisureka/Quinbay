function sentensify(str) {
  // Only change code below this line
  let newArr = str.split(/\W/);
  return newArr.join(" ");
  // Only change code above this line
}

sentensify("May-the-force-be-with-you");