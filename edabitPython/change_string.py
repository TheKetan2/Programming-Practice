def change_string(word):
	sol = ""
	for ch in list(word):
		if ch == ch.upper():
			char = (ord(ch)+1)
			sol += chr(char) if char<= ord("Z") else chr(ord("A")+(ord(chr(char))%ord("Z"))-1)
		else:
			sol += ch
	return sol.upper()[::-1]