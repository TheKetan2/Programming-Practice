def operation(num1, num2):
	if abs(num1 - num2) == 24:
		return "subtracted"
	elif num1 + num2 == 24:
		return "added"
	elif num1/num2 == 24 or num2/num1==24:
		return "divided"
	elif num1*num2 == 24:
		return "multiplied"
	else:
		return None
	#"added", "subtracted", "divided", "multiplied" or None.