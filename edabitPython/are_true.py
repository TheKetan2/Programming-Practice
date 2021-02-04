def are_true(a, b):
	if a == True :
		if b == True:
			return "both"
		else:
			return "first"
	elif b == True:
		return "second"
	else:
		return "neither"