function createID(firstname, lastname) {
  firstname = firstname.toLowerCase();
  lastname = lastname.toLowerCase();
  return firstname[0] + lastname[0].toUpperCase() + lastname.substr(1, 2);
}
