#hello friends, today we will create live pie chart.
# its is more like circular progress bar which we can use
# in our project, so lets start.

import matplotlib.pyplot as plt
from time import sleep

for i in range(100):
    plt.pie([100-i,i])
    plt.pause(0.001)
    plt.draw() # use draw instead of plt.show() as show is blocking
    #function and will stop the execution of loop. plt.pause() 
    # is also needs to be called :D Thank you for wathching, hope
    # you found this small simple code usefullllllll :D
    # have a great time. Peace .
    sleep(1)
    #let's try runnint it now
    # looks good right ;)
