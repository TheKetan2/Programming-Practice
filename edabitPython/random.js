const string =
  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vestibulum orci non maximus elementum. Nunc commodo non nibh aliquet tincidunt. Duis in nisl ipsum. Morbi aliquam odio lectus, dictum egestas turpis aliquam vulputate. Nam non tempus dui. Proin rutrum mi et suscipit cursus. Nam viverra fringilla tellus, non tristique diam commodo a. Duis eu ligula tristique, ullamcorper risus interdum, lobortis lectus. Praesent ut iaculis ex. Maecenas sem neque, lacinia euismod eleifend eu, varius non urna. Fusce quis faucibus quam. Etiam ultricies sapien quis cursus posuere. Fusce non condimentum purus, a maximus risus. Nullam eget lectus tellus. Integer gravida interdum varius. Aenean nec magna a dui condimentum porttitor vitae non sem Nunc vehicula consequat faucibus. Integer id eros nisi. Aenean et aliquam turpis. Curabitur suscipit consequat diam sit amet hendrerit. Quisque eu suscipit metus. Suspendisse nec felis neque. Vivamus quis rutrum orci. Nunc aliquam, tellus ac porttitor egestas, eros justo porttitor felis, vitae ultrices metus ex vitae nisl. Donec quis augue quis urna condimentum fringilla. Donec luctus ut dolor non imperdiet. Ut pretium leo augue, ac rhoncus dui ornare sit amet. Mauris lacinia mi a orci commodo dapibus. Etiam viverra mi id sapien sollicitudin tincidunt. Etiam placerat odio neque, vel fringilla risus elementum mattis. Morbi mollis massa sed risus vestibulum congue.";

generateRandomText = () => {
  let randomIndex = Math.floor(Math.random() * (string.length - 260));
  result = string.substr(randomIndex, 256);
  console.log(result.length);
  var str = Array.from({ length: 256 }, () =>
    String.fromCharCode(Math.random() * 94 + 33)
  ).join("");
  return str;
};

console.log(generateRandomText());
