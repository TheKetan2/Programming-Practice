def face_interval(num):
	if type(num) == type("str"):
		return ":/"
	interval = max(num) - min(num)
	if num.count(interval) >0:
		return ":)"
	return ":("