# 인공지능 시계

h, m, s = map(int, input().split())
n = int(input())

s += n % 60
n = n // 60

if s >= 60:
  m += 1
  s -= 60

m += n % 60
n = n // 60

if m >= 60:
  h += 1
  m -= 60
h += n % 24
if h >= 24:
  h -= 24

print(h, m, s)
