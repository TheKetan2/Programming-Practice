def is_alternating(num):
	odd = 90
	if num <=0:
		return False
	for n in list(str(num)):
		if odd == 90:
			odd = int(n)%2
		elif odd != int(n)%2:
			odd = int(n)%2
		else:
			return False
	return True
	