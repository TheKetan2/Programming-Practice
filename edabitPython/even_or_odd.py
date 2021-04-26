def even_or_odd(lst):
	sol = ["even","odd"]
	return "even" if len(lst) == 0 else sol[sum(lst)%2]
	