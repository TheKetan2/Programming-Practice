function secret(text) {
  let [tag, times] = text.split("*");
  let sol = "";
  for (let i = 0; i < parseInt(times); i++) {
    sol += `<${tag}></${tag}>`;
  }
  return sol;
}
