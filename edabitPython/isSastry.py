import math
def is_sastry(n):
	number = str(n) + str(n+1)
	rt = math.sqrt(int(number))
	return rt == rt//1		