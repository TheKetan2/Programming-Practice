def shared_letters(txt1, txt2):
	sol = ""
	for i in txt1:
		if i in txt2:
			sol += i
	return len(set(list(sol)))
	