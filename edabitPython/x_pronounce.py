def x_pronounce(sentence):
	strList = sentence.split(" ")
	sol = ""
	for word in strList:
		if len(word) == 1 and word == "x":
			sol += " ecks"
		elif word[0] == "x":
			sol += (" z"+ word[1:].replace("x", "cks"))
		else:
			sol += " "+word.replace("x", "cks")
	return sol.strip()
	
