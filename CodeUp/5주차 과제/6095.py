# 6095: 바둑판에 흰 돌 놓기

n = int(input())

go = [[0]*19 for _ in range(19)]

for i in range(n):
    x, y = map(int, input().split())
    go[x-1][y-1] = 1

for i in go:
    print(" ".join(repr(k) for k in i))