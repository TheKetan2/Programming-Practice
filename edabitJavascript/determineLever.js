function determineLever(arr) {
  return arr.join("") == "efl"
    ? "first class lever"
    : arr.join("") == "elf"
    ? "second class lever"
    : "third class lever";
}
