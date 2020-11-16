def is_orthogonal(first, second):
	zipped = list(zip(first, second))
	add = 0
	for a in zipped:
		add += a[0]*a[1]
	return add == 0
	
	# return not sum(x*y for x,y zip(first, second))

def double_char(txt):
	sol = ""
	for ch in list(txt):
		sol += (ch+ch)
	return sol
	
	