import sys;
args=sys.argv
a=int(args[1])
b=int(args[2])
if(a>b):
    if(a % 2 == 0):
        print (a," is even")
    else:
        print(a,"is odd")
else:
    if(b % 2 == 0):
        print (b,"is even")
    else:
        print(b,"is odd")
        
