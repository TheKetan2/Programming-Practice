def age_difference(f_age, s_age):
	sol = 0
	if f_age > s_age*2:
		while f_age != s_age*2:
			f_age +=1
			s_age +=1
			sol +=1
	else:
		while f_age != s_age*2:
			f_age -=1
			s_age -=1
			sol +=1
	
	return sol