def uncensor(txt, vowels):
	index = 0
	string  = ""
	for ch in txt:
		if ch == "*":
			string += vowels[index]
			index +=1
		else:
			string += ch
	return string