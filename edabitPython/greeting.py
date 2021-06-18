GUEST_LIST = {

	"Randy": "Germany", 	"Karla": "France", 

	"Wendy": "Japan", 

	"Norman": "England", 

	"Sam": "Argentina"

}

def greeting(name):

  return  "Hi! I'm "+ name+", and I'm from "+GUEST_LIST[name]+"." if GUEST_LIST.get(name)!= None else "Hi! I'm a guest."

	
