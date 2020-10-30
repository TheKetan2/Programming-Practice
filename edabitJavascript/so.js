// const css =
//   "body { background-color: lightblue; } h1 { color: white; text-align: center; } p { font-family: verdana; font-size: 20px; }";

// let parsedCss = css
//   .trim()
//   .split("}")
//   .map((word) =>
//     (word.replace(/[;]/gi, ";\n").replace(/[{]/gi, "{\n") + "}")
//       .trim()
//       .toString()
//   );
// parsedCss.pop();

// parsedCss.map((parsed) => console.log(parsed + ","));

// function getTriangleType(arr) {
//   return arr.length !== 3
//     ? "not a triandle"
//     : arr[0] == arr[1] && arr[0] == arr[2]
//     ? "equilateral"
//     : arr[0] !== arr[1] && arr[0] !== arr[2] && arr[1] !== arr[2]
//     ? "scalene"
//     : "isosceles";
// }

// export function getCupsCredentials() {
//   var vcap_services = process.env.VCAP_SERVICES;
//   var vcap_servces_as_single_line = vcap_services
//     ? vcap_services.replace(/\r?\n|\r/g, " ")
//     : "vcap_servisec is empty";
//   console.log(vcap_services);
//   /*
//     var vcap_servces_as_json = JSON.parse(vcap_servces_as_single_line)
//     var vcap_servces_user_provided = vcap_servces_as_json['user-provided']
//     var cups_credentials = vcap_servces_user_provided[0].credentials;
//     return cups_credentials;
//     */
// }

const Input = [
  {
    name: "John Doe",
    age: 50,
    address: "London AB",
    marks: { physics: 80, chemistry: 60, maths: 60 },
    assignments: [
      { subject: "physics", name: "ABC" },
      { subject: "physics", name: "ABC" },
      { subject: "maths", name: "ABC" },
      { subject: "maths", name: "ABC" },
    ],
  },
];

for (obj of Input) {
  console.log("name: ", obj["name"]);
  console.log("age: ", obj["age"]);
  console.log("address: ", `"${obj["address"].split(" ").join(", ")}"`);
  for (key of Object.keys(obj["marks"])) {
    console.log("marks=>", key, ":", obj["marks"][key]);
  }
  let assignments = obj["assignments"];
  console.log("assignments=>");
  for (let assignment of assignments) {
    console.log(assignment["subject"], ":", assignment["name"]);
  }
}
