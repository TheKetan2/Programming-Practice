function isMAC48Address(inputString) {
  let mac = inputString.trim().split("-");
  console.log(mac);
  for (m of mac) {
    // console.log(m)
    console.log(parseInt("0x" + m));
    m = m.trim();
    if (m.length > 2) {
      console.log(m);
      return false;
    }
    if (isNaN(parseInt("0x" + m.substr(1))) || isNaN(parseInt("0x" + m))) {
      console.log(m);
      return false;
    }
  }

  return true;
}
