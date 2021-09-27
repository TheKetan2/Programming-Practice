function rearrange(sentence) {
  let arr = sentence.trim().split(" ");
  arr.sort((a, b) => {
    return (
      parseInt(a.replace(/[^0-9]/g, "")) - parseInt(b.replace(/[^0-9]/g, ""))
    );
  });
  return arr.map((a) => a.replace(/[0-9]/g, "")).join(" ");
}
