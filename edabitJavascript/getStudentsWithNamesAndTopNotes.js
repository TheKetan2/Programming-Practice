const getStudentsWithNamesAndTopNotes = (students) =>
  students.map((obj) => {
    let { name, notes } = obj;
    return { name: name, topNote: Math.max(...notes, 0) };
  });
