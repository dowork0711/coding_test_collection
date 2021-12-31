# 부호

## 반복문으로 여러줄을 입력 받아야 할 때 input()으로 입력을 받으면 시간초과가 발생해서 sys.stdin.readline()을 사용함.
import sys
input = sys.stdin.readline()

for i in range (3):
  n = int(input())
  li = [int(input()) for _ in range(n)]
  if sum(li) == 0:
    print(0)
  elif sum(li) > 0:
    print("+")
  else:
    print("-")