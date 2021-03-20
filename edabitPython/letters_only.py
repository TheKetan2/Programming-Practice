# https://edabit.com/challenge/vqMFpARj3DvELLDmZ
import re
def letters_only(txt):
	return re.sub('[^a-zA-Z\n]', '', txt)
	