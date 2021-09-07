<<<<<<< HEAD
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
=======
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
>>>>>>> 6eab03cfe5c5badad18cff0b17a831df880c13ce
