// Setup
const contacts = [
  {
    firstName: "Akira",
    lastName: "Laine",
    number: "0543236543",
    likes: ["Pizza", "Coding", "Brownie Points"],
  },
  {
    firstName: "Harry",
    lastName: "Potter",
    number: "0994372684",
    likes: ["Hogwarts", "Magic", "Hagrid"],
  },
  {
    firstName: "Sherlock",
    lastName: "Holmes",
    number: "0487345643",
    likes: ["Intriguing Cases", "Violin"],
  },
  {
    firstName: "Kristian",
    lastName: "Vos",
    number: "unknown",
    likes: ["JavaScript", "Gaming", "Foxes"],
  },
];

function lookUpProfile(name, prop) {
  // Only change code below this line
  let contactFound = false;
  for (let i = 0; i < contacts.length; i++) {
    if (contacts[i].firstName === name) {
      contactFound = true;
      if (contacts[i].hasOwnProperty(prop)) {
        return contacts[i][prop];
      }
    }
  }
  // Contact was found but property was not found that's why the return statement in that if condition did not execute
  if(contactFound === true) {
    return "No such property";
  }
  else {
    return "No such contact";
  }
  // Only change code above this line
}

lookUpProfile("Akira", "likes");