import math
def get_number_of_apples(n, p):
	if n == 0 or int(p[:-1]) == 100:
		return "The children didn't get any apples"
	return math.floor(n- n* int(p[:-1])/100)
	