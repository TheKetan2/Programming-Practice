def flatten_the_curve(lst):
	return [round(sum(lst)/len(lst),1) for i in range(len(lst))]
	