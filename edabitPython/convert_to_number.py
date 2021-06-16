def convert_to_number(dictionary):
	for i in dictionary:
		dictionary[i] = int(dictionary[i])
	return dictionary