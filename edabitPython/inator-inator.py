def inator_inator(inv):
	return inv+"-inator "+str(1000*len(inv)) if "aeiouIEIOU".count(inv[-1]) >0 else inv+"inator " + str(1000*len(inv))
