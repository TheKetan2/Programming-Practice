def jay_and_bob(txt):
	obj = {"half": 2, "quarter":4, "eighth": 8, "sixteenth": 16}
	sol = 28/obj[txt]
	return str(round(sol) if round(sol)== sol else sol) +" grams"
	