n1=int(input("Enter 1st number = "))
n2=int(input("Enter 2nd number = "))
if n1 > n2:
    for i in range(n1,n2+1,-1):
        if(i%2==0):
            print(i);
else:
    i=n2
    while(i>n1):
        if(i%2==0):
            print(i);
        i=i-1;


print("bye")
            
