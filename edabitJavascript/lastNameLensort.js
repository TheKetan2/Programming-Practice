function lastNameLensort(names) {
  return names.sort((a, b) => {
    let first = a.split(" ")[1];
    let second = b.split(" ")[1];
    if (first.length == second.length) {
      return first.localeCompare(second);
    }
    return first.length - second.length;
  });
}
