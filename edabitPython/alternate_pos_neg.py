def alternate_pos_neg(lst):
	for i in range(0, len(lst)-1):
		if  lst[i] >=0 and lst[i+1] >=0:
			return False
		elif lst[i] <0 and lst[i+1] < 0:
			return False
	return True
	