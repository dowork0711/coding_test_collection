# 사탕 선생 고창영

import sys

# readline괄호 붙이면 input에 괄호를 쓸 수가 없다.
input = sys.stdin.readline

for _ in range(int(input())):
  input().rstrip()
  N = int(input().rstrip())
  candies = [int(input().rstrip()) for _ in range(N)]
  print("YES" if sum(candies) % N == 0 else "NO")