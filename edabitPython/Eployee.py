class Employee:
	def __init__(self, firstname, lastname):
		self.firstname = firstname
		self.lastname = lastname
		self.fullname = firstname+" "+lastname
		self.email = (firstname+"."+lastname+"@company.com").lower()
		# Complete the code!
		