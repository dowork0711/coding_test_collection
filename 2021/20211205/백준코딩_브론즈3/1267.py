# 핸드폰 요금

N = int(input())
t = list(map(int, input().split()))
y = m = 0

for i in t:
  y += (i // 30 + 1) * 10
  m += (i // 60 + 1) * 15

if m == y:
  print("Y M", m)
elif m < y:
  print("M", m)
else:
  print("Y", y)
