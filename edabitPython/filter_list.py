def filter_list(l):
	sol = []
	for elem in l:
		try:
			int(elem)
			sol.append(elem)
		except:
			print("not number")
	return sol