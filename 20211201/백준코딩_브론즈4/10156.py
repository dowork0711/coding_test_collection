# 과자

k, n, m = map(int, input().split())

snack = k * n

if (snack > m):
  print(snack-m)
elif (snack <= m):
  print(0)
