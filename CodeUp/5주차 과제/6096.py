# 6096 바둑알 십자 뒤집기

go = [list(map(int, input().split())) for _ in range(19)]

n = int(input())

for i in range(n):
    p, q = map(int, input().split())
    for j in range(19):
        go[p-1][j] = 1 if go[p-1][j] == 0 else 0
        go[j][q-1] = 1 if go[j][q-1] == 0 else 0

for i in go:
    print(" ".join(repr(k) for k in i))