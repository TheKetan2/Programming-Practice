def str_to_dict(lst):
	sol = {}
	for elem in lst:
		keyVal = elem.split("=")
		sol[keyVal[0]] = keyVal[1] 
	return sol