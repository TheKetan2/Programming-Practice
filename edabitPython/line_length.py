import math
def line_length(dot1, dot2):
	sol = math.sqrt(math.pow(dot1[0]-dot2[0], 2) + math.pow(dot1[1]-dot2[1], 2))
	return round(sol,2)