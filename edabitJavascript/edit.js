// Input will be an array of objects of the form:
// {operation: "insert", text: string, position: number}
// {operation: "delete", from: number, length: number}
function edit(operations) {
  let sol = "";
  for (let obj of operations) {
    if (obj["operation"] === "insert") {
      sol =
        sol.substr(0, obj["number"]) + obj["text"] + sol.substr(obj["number"]);
    } else {
      sol = sol.substr(0, obj["from"]) + sol.substr(obj["length"] + ["from"]);
    }
  }
}
