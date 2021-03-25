# https://edabit.com/challenge/vQgmyjcjMoMu9YGGW
def simplify(txt):
	a, b = [int(i) for i in txt.split("/")]
	for i in range(2, max(a,b)):
		while a%i ==0 and b%i==0:
			a /=i
			b /=i
	return str(round(a)) if b==1 else str(round(a))+"/"+str(round(b))
		