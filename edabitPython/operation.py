def operation(a, b, op):
	if op == "add":
		return str(int(a)+int(b))
	elif op == "subtract":
		return str(int(a)-int(b))
	elif op == "multiply":
		return str(int(a)*int(b))
	elif op == "divide":
		if b == "0":
			return "undefined"
		else:
			return str(int(a)//int(b))
	