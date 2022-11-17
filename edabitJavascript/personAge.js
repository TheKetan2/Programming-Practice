class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  compareAge(other) {
    console.log(this.name, this.age, other.name, other.age);
    let age =
      this.age > other.age
        ? "younger than"
        : this.age < other.age
        ? "older than"
        : "the same age as";
    return `${other.name} is ${age} me.`;
  }
}
