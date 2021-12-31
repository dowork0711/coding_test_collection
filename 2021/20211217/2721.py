# 삼각수의 합

'''
1부터 n까지의 합
n(n+1) / 2



'''

import sys

input = sys.stdin.readline

# T(n)
def tn (n):
  return (n*(n+1))//2

# 삼각수의 합
T = int(input())
for i in range(T):
  num = int(input())
  
  summary = 0
  for k in range(1, num):
    summary += k * tn(k+1)

  print(summary)
  