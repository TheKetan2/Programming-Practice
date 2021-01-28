def correct_sentences(s):
	sentense = s.strip().split()
	sol = ""
	for i in range(len(sentense)):
		if i == 0:
			sol += sentense[i].title()
		elif sentense[i][0] == sentense[i][0].upper():
			sol += ". "+sentense[i]
		else:
			sol += " "+sentense[i]
	return sol+"."