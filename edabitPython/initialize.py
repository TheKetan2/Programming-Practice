def initialize(names):
	sol = []
	for ls in names:
		temp = ""
		for w in ls.split(" "):
			temp += w[0].title()+". "
		sol.append(temp.strip())
	return sol