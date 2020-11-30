def longest_abecedarian(lst):
	l = []
	for str in lst:
		temp = list(str)
		temp.sort()
		if "".join(temp) == str:
			l.append(str)
	l.sort()
	l.sort(key=len)
	print(l)
	return "" if len(l) == 0 else l[-1]
	