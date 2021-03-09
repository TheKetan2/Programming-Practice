#https://edabit.com/challenge/kgMEhkNNjRmBTAAPz
def remove_special_characters(txt):
	sol = ""
	for ch in list(txt):
		if ch.isalnum() or " -_".count(ch)>0:
			sol +=ch
	return sol
	