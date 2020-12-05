
def time_adjust(now, hrs, mins, sec):
	totalSec = hrs*3600 + mins*60 + sec
	temp = now.split(":")
	print(temp)
	nowSec = int(temp[0])*3600 + int(temp[1])*60 + int(temp[2])
	print(nowSec)
	totalSec += nowSec
	h = (totalSec//3600)
	totalSec %= 3600
	m = (totalSec//60)
	totalSec %= 60
	return ("0000"+str(h%24))[-2:] +":"+ ("00"+str(m))[-2:]+":" + ("00"+str(totalSec))[-2:]
	
	