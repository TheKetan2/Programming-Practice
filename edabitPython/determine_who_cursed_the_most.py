def determine_who_cursed_the_most(d):
	print(d["round1"])
	me = d["round1"]["me"] + d["round2"]["me"] + d["round3"]["me"]
	spouse = d["round1"]["spouse"] + d["round2"]["spouse"] + d["round3"]["spouse"]
	if me == spouse:
		return ("DRAW!")
	elif me > spouse:
		return "ME!"
	else:
		return "SPOUSE!"
	