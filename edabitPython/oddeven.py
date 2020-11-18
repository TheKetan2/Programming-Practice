def oddeven(lst):
	odd = 0
	even = 0
	for elem in lst:
		if elem%2 == 0:
			even +=1
		else:
			odd +=1
	return odd > even
	