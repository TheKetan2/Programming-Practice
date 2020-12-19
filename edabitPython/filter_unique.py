def filter_unique(lst):
	sol = []
	for elem in lst:
		if len(elem) == len(set(elem)):
			sol.append(elem)
	return sol
	
	#https://edabit.com/challenge/GXgsHZ9emoW5bhxhh