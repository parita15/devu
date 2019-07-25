import sys;
import time
start=time.time()
#print(start)

args=sys.argv
a=int(args[1])
b=int(args[2])
for i in range(a,b+1):
        for j in range(2,i):
            if(i % j == 0 ):
                break;
        else:
            print(i,"is prime")
end=time.time()
#print(end)
print(end - start)
