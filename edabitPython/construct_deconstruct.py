def construct_deconstruct(s):
	sol = []
	for i in range(0,len(s)):
		sol.append(s[0:i+1])
	return sol+sol[0:-1][::-1]