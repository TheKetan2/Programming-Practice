def arrow(num):
	sol = []
	for i in range(1,num+1):
		sol.append(">"*i)
	first = sol if len(sol)%2 ==0 else sol[:-1]
	return first + sol[::-1]
	