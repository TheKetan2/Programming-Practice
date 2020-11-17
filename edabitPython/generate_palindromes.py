def generate_palindromes(limit):
	sol = []
	for i in range(10, limit+1):
		if i == int("".join(list(str(i))[::-1])):
			sol.append(i)
	return sol[-15::]