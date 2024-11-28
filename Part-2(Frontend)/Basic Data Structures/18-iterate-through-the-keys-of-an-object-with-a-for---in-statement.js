const users = {
  Alan: {
    online: false
  },
  Jeff: {
    online: true
  },
  Sarah: {
    online: false
  }
}

function countOnline(allUsers) {
  // Only change code below this line
  let cnt = 0;
  for (let user in allUsers) {
    if (allUsers[user].online === true) {
      cnt++;
    }
  }
  return cnt;
  // Only change code above this line
}

console.log(countOnline(users));