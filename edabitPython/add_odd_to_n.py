def add_odd_to_n(n):
	add = 0
	for i in range(0,n+1):
		if i%2 != 0:
			add +=i
	return add
	