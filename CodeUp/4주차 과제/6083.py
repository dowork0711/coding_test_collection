# 6083: 빛 섞어 색 만들기

r, g, b = map(int, input().split())
total = 0

for i in range(r):
    for j in range(g):
        for k in range(b):
            print("%d %d %d" % (i, j, k))
            total += 1

print(total)