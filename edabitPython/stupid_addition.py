#https://edabit.com/challenge/6dnhESWBcTMMF3gsa
def stupid_addition(a, b):
	if a == str(a) and b == str(b):
		return int(a)+int(b)
	elif a != str(a) and b != str(b):
		return str(a)+str(b)
	else: 
		return None
	