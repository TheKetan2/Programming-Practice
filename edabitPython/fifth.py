def fifth(*args):
	if len(args)>=5:
		return type(args[4])
	return "Not enough arguments"
	