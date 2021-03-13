# https://edabit.com/challenge/eZ9Fimj4ddpr7Ypof
def mumbling(s):
	s =list(s.upper())
	sol = ""
	for i in range(len(s)):
		sol += ("-"+s[i]+s[i].lower()*i)
	return sol[1:]