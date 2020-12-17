def max_separator(txt):
	sol = []
	mx = 0
	for i in range(0, len(txt)):
		start = txt[i:].find(txt[i])
		end = txt[i+1:].find(txt[i])
		dist = end - start +1
		print(dist)
		if mx < dist:
			mx = dist
			sol = []
			sol.append(txt[i])
		elif mx == dist:
			sol.append(txt[i])
			
	return [] if len(sol) == len(txt) else sorted(sol)
	