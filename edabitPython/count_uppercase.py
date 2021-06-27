def count_uppercase(lst):
	return sum(letter.isupper() for letter in "".join(lst))