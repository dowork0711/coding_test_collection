# 손익 분기점

## a = 고정비용
## b = 놋북 한대당 재료비와 인건비(가변비용)
## c = 노트북 가격
a, b, c = map(int, input().split())

if (c-b) <= 0:
  print("-1")
else:
  n = a / (c - b)
  n = n + 1
  print(int(n))
