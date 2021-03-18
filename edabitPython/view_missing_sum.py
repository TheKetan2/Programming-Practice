# https://edabit.com/challenge/Aj377wZtxWya7gjK9
def sum_missing_numbers(lst):
	sol = 0
	[m, l] = [max(lst), min(lst)]
	print(m,l)
	for i in range(l, m+1):
		if lst.count(i) == 0:
			sol +=i
	return sol