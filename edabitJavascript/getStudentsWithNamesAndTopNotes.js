function getStudentsWithNamesAndTopNotes(students) {
  let sol = students.map((obj) => {
    let { name, notes } = obj;
    return { name: name, topNote: Math.max(...notes, 0) };
  });
  return sol;
}
