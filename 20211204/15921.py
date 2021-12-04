# 수찬은 마린보이야!!

n = int(input())

if n == 0:
  print("divide by zero")
else:
  li = list(map(int, input().split()))
  res = (sum(li) / n) / (sum(li) / n)
  print("%.2f" % res)
