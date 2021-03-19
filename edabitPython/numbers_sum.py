# https://edabit.com/challenge/jQGT8CNFcMXr55jeb
def numbers_sum(lst):
	sum = 0
	for elem in lst:
		if type(elem) == int:
			sum += elem
	return sum