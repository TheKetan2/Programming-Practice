# https://edabit.com/challenge/jwzgYjymYK7Gmro93
def get_indices(lst, el):
	sol = []
	for i in range(len(lst)):
		if lst[i] == el:
			sol.append(i)
	return sol