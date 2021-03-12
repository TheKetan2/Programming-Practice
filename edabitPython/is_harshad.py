# https://edabit.com/challenge/eADRy5SA5QbasA3Qt
def is_harshad(n):
	sum = 0
	temp = n
	while n>0:
		sum += n%10
		n //=10
	return temp%sum == 0