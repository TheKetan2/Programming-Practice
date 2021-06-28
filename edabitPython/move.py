def move(word):
	return "".join([chr(ord(i)%97 + 97+1) for i in word])
	