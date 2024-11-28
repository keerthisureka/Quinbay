function titleCase(str) {
  let newStr = "";
  for (let i = 0; i < str.length; i++) {
    if(i == 0 || str.charAt(i-1) === ' ') {
      newStr += str.charAt(i).toUpperCase();
    }
    else {
      newStr += str.charAt(i).toLowerCase();
    }
  }
  return newStr;
}

titleCase("I'm a little tea pot");