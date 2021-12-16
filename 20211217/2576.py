# 홀수

import sys
input = sys.stdin.readline

number = []

for i in range(7):
  num = int(input())
  if num % 2 != 0:
    number.append(num)

if number:
  print(sum(number))
  print(min(number))
else:
  print(-1)