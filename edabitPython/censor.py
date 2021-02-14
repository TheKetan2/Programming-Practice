def censor(s):
	lst = []
	for word in s.split(" "):
		if len(word)>4:
			lst.append("*"* len(word))
		else:
			lst.append(word)
	return " ".join(lst)