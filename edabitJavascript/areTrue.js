function areTrue(a, b) {
	return a && b?"both":!a && !b?"neither":a?"first":"second";
}