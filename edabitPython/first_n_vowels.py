def first_n_vowels(txt, n):
	sol = ""
	for ch in txt:
		if "aeiou".count(ch) >0:
			sol += ch
	return sol[:n] if len(sol)>=n else "invalid"
