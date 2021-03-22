# https://edabit.com/challenge/3wLZvWf4sFerNQmo7
def neutralise(s1, s2):
	sol = ""
	for i in range(len(s1)):
		if s1[i]== s2[i]:
			sol += s1[i]
		else:
			sol += "0"
	return sol
	