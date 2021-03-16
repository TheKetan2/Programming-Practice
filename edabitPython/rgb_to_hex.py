# https://edabit.com/challenge/QyKRBtaMDWofm5D3u
def rgb_to_hex(col):
	lst = col.replace("rgb","").replace("(","").replace(")","").split(",")
	sol = "#"
	for item in lst:
		string = ""
		if item.strip() == "0":
			string = "00"
		else:
			string = str(hex(int(item)))[2:]
		sol += string
	return sol
	