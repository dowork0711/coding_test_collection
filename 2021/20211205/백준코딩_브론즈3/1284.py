# 집 주소

while True:
  n = input()
  if n == '0':
    break

  res = 2 + len(n) - 1
  for i in n:
    if i in '1':
      res += 2
    elif i in '23456789':
      res += 3
    elif i in '0':
      res += 4
  
  print(res)