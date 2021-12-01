# AFC 윔블던

p, q = map(int, input().split())

if (p+q < 0) or (p-q < 0) or (p+q) % 2:
  print(-1)
else:
  a = (p + q) // 2
  b = p - a
  print(max(a, b), min(a, b))
