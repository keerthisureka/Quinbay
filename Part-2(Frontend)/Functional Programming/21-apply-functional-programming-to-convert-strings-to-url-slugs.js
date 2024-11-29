// Only change code below this line
function urlSlug(title) {
  let newArr = title.toLowerCase().trim().split(/\s+/);
  return newArr.join("-");
}
// Only change code above this line
urlSlug("A Mind Needs Books Like A Sword Needs A Whetstone");