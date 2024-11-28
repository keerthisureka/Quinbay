function mutation(arr) {
  const a0 = arr[0].toLowerCase();
  const a1 = arr[1].toLowerCase();
  for (let i = 0; i < a1.length; i++) {
    if (a0.indexOf(a1[i]) === -1) {
      return false;
    }
  }
  return true;
}

mutation(["hello", "hey"]);