def count_vowels(txt):
	sum = 0
	for i in list("aeiou"):
		sum += txt.lower().count(i)
	return sum
	
	