# https://edabit.com/challenge/e3KZvJbSXeHXtJA7c
def sum_missing_numbers(lst):
	sum = 0
	for i in range(min(lst), max(lst)):
		if lst.count(i) == 0:
			sum += i
	return sum
	