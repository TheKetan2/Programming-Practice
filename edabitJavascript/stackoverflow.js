let arrobj = [
  {
    id: 1,
    editors: "Andrew||Maria",
    authors: "Dorian||Gabi",
    agents: "Bob||Peter",
  },
  {
    id: 2,
    editors: "Dorian||Guybrush",
    author: "Peter||Frodo",
    agents: "Dorian||Otto",
  },
  {
    id: 3,
    editors: "Klaus||Otmar",
    authors: "Jordan||Morgan",
    agents: "Jordan||Peter",
  },
];

for (let obj of arrobj) {
  obj.involved = "";
  for (let key of Object.keys(obj)) {
    let strKey = [...key];
    strKey.pop();
    let role = strKey.join("");
    if (key === "involved") break;
    if (key !== "id") {
      obj.involved += obj[key]
        .split("||")
        .map((name) => name + "(" + role + ")||")
        .join("");
    }
    obj.involved = obj.involved.substr(0, obj.involved.length - 2).trim();
  }
}

console.log(arrobj);

let result = [];

const getEmailMembersFromList = async (listID, offset, count) => {
  const response = await mailchimpMarketing.lists.getListMembersInfo(listID, {
    offset,
    count,
  });
  emails = response.members.map((member) => {
    return member.email_address;
  });
  result = [...result, ...emails];
  console.log(result);
};
