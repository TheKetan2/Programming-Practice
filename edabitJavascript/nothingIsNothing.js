function nothingIsNothing(...args) {
  let temp = args.filter((a) => a);
  return args.length === temp.length;
}
