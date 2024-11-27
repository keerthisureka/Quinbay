function rangeOfNumbers(startNum, endNum) {
  if (startNum == endNum) {
    return [endNum];
  } else {
    const arr = rangeOfNumbers(startNum, endNum-1);
    arr.push(endNum);
    return arr;
  }
}