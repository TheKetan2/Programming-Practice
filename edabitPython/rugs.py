def make_rug(*args):
	print(len(args))
	if len(args) == 2:
		return ["#"*args[1] for i in range(args[0])]
	else:
		return [args[2]*args[1] for i in range(args[0])]