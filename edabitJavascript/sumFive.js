function sumFive(arr) {
  return arr.filter((n) => n > 5).reduce((a, c) => a + c, 0);
}
const user = {
  name: "John",
  email: "john@example.com",
  city: "Phoenix",
  state: "AZ",
  country: "USA",
};
const str = `({ name, email,...rest} = user ).toString()`;
const str2 = `({ one=1, two=1 } = { two : 2 }).toString()`;
