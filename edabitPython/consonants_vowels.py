import re
def consonants(word):
	word = re.sub('[^a-zA-Z0-9\n\.]', ' ', word)
	return len(word) - vowels(word) - list(word).count(" ")
def vowels(word):
	word = word.lower()
	sol = 0
	print(word+" vowels")
	vowels = ["a","e","i","o","u"]
	for ch in vowels:
		sol += list(word).count(ch)
	return sol
	
	