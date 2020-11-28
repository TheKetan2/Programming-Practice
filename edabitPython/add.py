def add(n1, n2):
	try:
		sum = int(n1) + int(n2)
		return str(sum)
	except:
		return "Invalid Operation"
	
	