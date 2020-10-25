const css =
  "body { background-color: lightblue; } h1 { color: white; text-align: center; } p { font-family: verdana; font-size: 20px; }";

let parsedCss = css
  .trim()
  .split("}")
  .map((word) =>
    (word.replace(/[;]/gi, ";\n").replace(/[{]/gi, "{\n") + "}")
      .trim()
      .toString()
  );
parsedCss.pop();

parsedCss.map((parsed) => console.log(parsed + ","));

function getTriangleType(arr) {
  return arr.length !== 3
    ? "not a triandle"
    : arr[0] == arr[1] && arr[0] == arr[2]
    ? "equilateral"
    : arr[0] !== arr[1] && arr[0] !== arr[2] && arr[1] !== arr[2]
    ? "scalene"
    : "isosceles";
}
