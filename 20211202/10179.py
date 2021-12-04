# 쿠폰

test_case = int(input())

for _ in range (test_case):
  op = float(input())
  print("$%.2f" % round(op * 0.8, 2))
