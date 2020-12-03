def longest_zero(s):
	lst = s.split("1")
	lst.sort(key=len)
	return lst[-1] 