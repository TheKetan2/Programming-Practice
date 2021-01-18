def to_scottish_screaming(txt):
	lst = list(txt.upper())
	for i in range(len(lst)):
		if "AEIOU".count(lst[i]) != 0:
			lst[i] = "E"
	return "".join(lst)
	
	