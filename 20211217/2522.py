# 별 찍기 12

'''
  *     공백2 별1       공백 + 별 = 3
 **     공백1 별2
***     공백0 별3
 **     공백1 별2
  *     공백2 별1
'''

n = int(input())

for i in range(1, n+1):
  print(" "*(n-i) + "*"*i)

for i in range(1, n):
  print(" " * i + "*"*(n-i))