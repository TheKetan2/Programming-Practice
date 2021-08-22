function equalCount(str, names) {
  let strArr = str.replace(/[^a-zA-Z]/g, "").match(/[A-Z][a-z]+/g);
  let obj = {};
  for (let name of strArr) {
    if (obj[name]) {
      obj[name] += 1;
    } else {
      obj[name] = 1;
    }
  }
  //   console.log(obj);
  let [name1, name2] = names.split("&");
  //   console.log(name1, name2);
  let key = obj[name1] === obj[name2] ? "equality" : "difference";
  let sol = {
    [name1]: obj[name1] ? obj[name1] : 0,
    [name2]: obj[name2] ? obj[name2] : 0,
  };

  return key == "equality"
    ? { ...sol, equality: true }
    : {
        ...sol,
        equality: false,
        difference: Math.abs(obj[name1] - obj[name2]),
      };
}
