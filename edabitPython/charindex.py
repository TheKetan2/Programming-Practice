def char_index(word, char):
	try:
		return [word.index(char), word.rindex(char)]
	except:
		return None