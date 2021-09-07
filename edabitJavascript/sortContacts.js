function sortContacts(names, sort) {
  if (!names) {
    return [];
  }
  if (sort === "ASC") {
    names.sort((a, b) => {
      return a.split(" ")[1].localeCompare(b.split(" ")[1]);
    });
  } else if (sort === "DESC") {
    names.sort((a, b) => {
      return b.split(" ")[1].localeCompare(a.split(" ")[1]);
    });
  }
  return names;
}
