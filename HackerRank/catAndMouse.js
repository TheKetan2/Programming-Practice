/**
 * Cats and a Mouse
 * @param {*} x
 * @param {*} y
 * @param {*} z
 */
function catAndMouse(x, y, z) {
  let aToC = Math.abs(x - z);
  let bToC = Math.abs(y - z);
  if (aToC === bToC) {
    return "Mouse C";
  } else if (aToC < bToC) {
    return "Cat A";
  }
  return "Cat B";
}
