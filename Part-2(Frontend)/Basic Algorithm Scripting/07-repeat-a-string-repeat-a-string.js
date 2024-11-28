function repeatStringNumTimes(str, num) {
  let newStr = "";
  while (num > 0) {
    newStr += str;
    num--;
  }
  return newStr;
}

repeatStringNumTimes("abc", 3);