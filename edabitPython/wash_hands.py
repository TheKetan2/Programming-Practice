def wash_hands(N, nM):
	totalSec = 21*N*nM*30
	print(totalSec)
	return str(totalSec//60) +" minutes and "+str(totalSec%60)+" seconds"