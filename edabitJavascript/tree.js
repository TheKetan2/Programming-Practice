class TreeNode {
  constructor(value) {
    this.value = value;
    this.descendants = [];
  }
}

const abe = new TreeNode("Abe");
const homer = new TreeNode("Homer");
const bart = new TreeNode("Bart");
const list = new TreeNode("Lisa");
const maggie = new TreeNode("Maggie");

abe.descendants.push(homer);
homer.descendants.push(bart, list, maggie);

console.log(JSON.stringify(abe));

/**
 * Tree data structures have many applications such as:
 * Maps
 * Sets
 * Databases
 * Priority Queues
 * Querying an LDAP (Lightweight Directory Access Protocol)
 * Representing the Document Object Model (DOM) for HTML on Websites.
 * Trees nodes can have zero or more children.
 * However, when a tree has at the most two children, then it’s called binary tree.
 */
