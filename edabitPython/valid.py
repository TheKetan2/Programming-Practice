def valid(txt):
	if len(txt) != 4:
		if len(txt) != 6:
			return False
	for i in txt:
		try:
			int(i)
		except:
			return False
	return True
		
	