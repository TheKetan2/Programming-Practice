#https://edabit.com/challenge/SaC7tapGFxssdayWE
def find_vertex(a, b, c):
	x = round(-b/(2*a), 2)
	return [x, (a*(x*x)+b*x+c)]