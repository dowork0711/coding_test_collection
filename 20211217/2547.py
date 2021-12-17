# 사탕 선생 고창영
# https://www.acmicpc.net/problem/2547

import sys

# readline괄호 붙이면 input에 괄호를 쓸 수가 없다.
input = sys.stdin.readline

T = int(input())

for _ in range(T):
  summary = 0

  input().rstrip()
  N = int(input().rstrip())
  candies = [int(input().rstrip()) for _ in range(N)]

  for i in range(N):
    summary += candies[i]

  if summary % N == 0:
    print("YES")
  else:
    print("NO")












  # candies = []
  # for _ in range(N):
  #   c = int(input().rstrip())
  #   candies.append(c)

  # candies = []
  # for _ in range(N):
  #   candies.append(int(input().rstrip()))

  

    

  
