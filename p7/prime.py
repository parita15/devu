import sys;
import time;
start=time.time()

args=sys.argv
a=int(args[1])

for i in range(2,a):
    if(a % i == 0 ):
        print(a,"is not prime");
        break;
    else:
        print(a,"is prime");
        break;
end=time.time()
print(end - start)

