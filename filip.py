
lst = list(input().split())
a = lst[0]
b = lst[1]
l1 = len(a)
l2 = len(b)
if(l1 == 3 and l2 == 3):
   a = int(a[::-1])
   b = int(b[::-1])
   if(a > b):
     print(a)
   else:
     print(b)