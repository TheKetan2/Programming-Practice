def hacker_speak(txt):
	dict = {"a":4, "e":3, "i":1, "o":0,"s":5}
	sol = ""
	for ch in list(txt):
		try:
			sol += str(dict[ch])
		except:
			sol += ch
	return sol