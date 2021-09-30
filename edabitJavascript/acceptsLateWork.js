// english class object
const english = {
  advanced: {
    // advanced curriculum
    teacher: "Ms. Abrimian",
    acceptsLateWork: false,
  },
  standard: {
    // standard curriculum
    teacher: "Mr. Sheehan",
    acceptsLateWork: true,
  },
};

// math class object
const math = {
  advanced: {
    teacher: "Mr. Citrano",
    acceptsLateWork: false,
  },
  standard: {
    teacher: "Ms. Marinelli",
    acceptsLateWork: false,
  },
};

function acceptsLateWork(teacher) {
  let arr = [...Object.values(math), ...Object.values(english)];
  for (let obj of arr) {
    if (obj.teacher === teacher) {
      return obj.acceptsLateWork;
    }
  }
}
