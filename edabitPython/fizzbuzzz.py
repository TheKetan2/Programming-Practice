def fizz_buzz(maximum):
	sol = []
	for i in range(1, maximum+1):
		if i%3==0 and i%5==0:
			sol.append("FizzBuzz")
		elif i%3==0:
			sol.append("Fizz")
		elif i%5==0:
			sol.append("Buzz")
		else:
			sol.append(i)
	print(sol)
	return sol