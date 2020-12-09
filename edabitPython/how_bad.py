def how_bad(n):
	sol = []
	binary = list("{0:b}".format(n))
	binSum = binary.count("1")
	print(binSum)
	if binSum%2 == 0:
		sol.append("Evil")
	else:
		sol.append("Odious")
	if prime(binSum):
		sol.append("Pernicious")
	return sol
	
def prime(n):
	if n == 1:
		return False
	if n in [2, 3, 5]:
		return True
	for i in range(2, n):
		if n%i==0:
			return False
	return True

	