def car_timer(n):
	time = list(str(n//60) + str(n%60))
	sol = sum([int(i) for i in time])
	return sol
	
	