import sys;
import time;

#start=time.time();

args=sys.argv;
cnt=len(sys.argv)-1;

sum=0;
i=1;
max=int(args[1])
min=int(args[1])

while(i<cnt):
    sum = sum + int(args[i]);
    j=1;
    while(j<=cnt):
        if(min > int(args[j])):
            min=int(args[j]);
        if(max < int(args[j])):
            max=int(args[j]);
        j = j + 1
    i = i + 1;
print("min= ",min);
print("max= ",max);
a=sum/cnt;
print("avg = ",a);

