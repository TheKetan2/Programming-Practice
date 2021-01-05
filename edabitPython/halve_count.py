def halve_count(a, b):
	# recursive code here
	sol = 0
	
	while a > b:
		a /=2
		if a > b:
			sol +=1
		halve_count(a/2, b)
		
	return sol