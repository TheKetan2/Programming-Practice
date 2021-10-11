function addStrNums(num1, num2) {
  num1 = !num1.trim().length
    ? 0
    : num1.replace(/[0-9]/g, "").length
    ? "amamam"
    : num1;
  num2 = !num2.trim().length
    ? 0
    : num2.replace(/[0-9]/g, "").length
    ? "amamam"
    : num2;
  if (isNaN(parseInt(num1)) || isNaN(parseInt(num2))) {
    return "-1";
  }

  return (BigInt(num1) + BigInt(num2)).toString();
}
