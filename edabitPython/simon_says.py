def simon_says(lst):
	tot = 0
	for i in lst:
		if i.count("Simon says") == 1:
			wordLst = i.split(" ")
			if wordLst[2] == "add":
				tot += int(wordLst[-1])
			elif wordLst[2] == "subtract":
				tot -= int(wordLst[-1])
			elif wordLst[2] == "multiply":
				tot *= int(wordLst[-1])
	return tot