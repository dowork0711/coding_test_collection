# 공

cups = [1, 2, 3]

for _ in range(int(input())):
  X, Y = map(int, input().split())
  x = cups.index(X)
  y = cups.index(Y)
  cups[x], cups[y] = cups[y], cups[x]

print(cups[0])
