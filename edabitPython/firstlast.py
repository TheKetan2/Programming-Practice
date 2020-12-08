def first_arg(*kwargs ):
	try:
		return kwargs[0]
	except:
		return None
	

def last_arg(*kwargs):
	try:
		return kwargs[-1]
	except:
		return None 
	