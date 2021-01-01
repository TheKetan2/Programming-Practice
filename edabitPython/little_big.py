def little_big(n):
	one = 5
	two = 100
	sol = [5,100]
	for i in range (0, n+1):
		one +=1
		two *=2
		sol.append(one)
		sol.append(two)
	return sol[n-1]