import math
def total_overs(balls):
	if balls%6 == 0: 
		return balls/6
	return balls%6/10 + balls//6