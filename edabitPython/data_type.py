# https://edabit.com/challenge/i5kcGmT7gFKkf3mTi
def data_type(value):
	sol = {"dict":"dictionary","list":"list", "str":"string","int":"integer","float":"float","datetime.date":"date" }
	return sol[str(type(value)).replace('<class ',"")[1:-2]]
	