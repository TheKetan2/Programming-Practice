function hoursPassed(t1, t2) {
  let start =
    t1 == "12:00 AM"
      ? 0
      : parseInt(t1.trim().split(":")[0]) + (t1.includes("PM") ? 12 : 0);
  let end =
    t2 == "12:00 AM"
      ? 0
      : parseInt(t2.trim().split(":")[0]) + (t2.includes("PM") ? 12 : 0);
  console.log(start, end);
  return start == end ? "no time passed" : `${end - start} hours`;
}
