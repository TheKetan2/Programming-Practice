def recur_index(txt):
	dictionary = {}
	if type(txt) != type("sajja"):
		return {}
	if len(txt) == 0 or len(set(list(txt))) == len(txt):
		return {}
	for i in range(len(txt)):
		try:
			dictionary[txt[i]]
			return {txt[i]: dictionary[txt[i]] + [i]}
		except:
			dictionary[txt[i]] = [i]