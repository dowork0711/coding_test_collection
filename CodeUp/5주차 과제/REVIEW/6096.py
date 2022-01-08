# 6096: 바둑알 십자 뒤집기(py)

import sys

input = sys.stdin.readline

# 2차원 배열 입력받기
go = [list(map(int, input().split())) for _ in range(19)]

# 뒤집을 횟수 입력받기
n = int(input())

for i in range(n):
    x, y = map(int, input().split())
    for j in range(19):
        go[x-1][j] = 1 if go[x-1][j] == 0 else 0
        go[j][y-1] = 1 if go[j][y-1] == 0 else 0


for k in go:
    print(" ".join(map(str, k)))