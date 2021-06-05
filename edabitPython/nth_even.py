#python 3.7.1
def nth_even(n):
  i = 0
  while n>0:
    if i%2==0:
      n -=1
    i +=1
  return i if i%2==0 else i-1
	  
print (nth_even(1))
