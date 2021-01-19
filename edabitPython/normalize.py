def normalize(txt):
	end = ""
	if txt == txt.upper():
		end = "!"
	return txt[0].upper()+txt[1:].lower() + end