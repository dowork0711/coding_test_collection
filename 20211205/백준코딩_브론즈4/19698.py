# 헛간 청약

n, w, h, l = map(int, input().split())

p = w // l
q = h // l

res = p * q

if n < res:
  print(n)
else:
  print(res)