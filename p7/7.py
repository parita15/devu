import sys;
args=sys.argv;
a=int(args[1])
i=1;
for i in range(5):
    if(i == 2):
        continue;
    elif(i==4):
        break;
    else:
        print(i)
    
