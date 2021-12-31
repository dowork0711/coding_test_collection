# 세탁소 사장 동혁

dollars = [ 25, 10, 5, 1 ]

T = int(input())

for i in range(T):
  res = [] 
  get_money = int(input())

  for j in range(len(dollars)):
    res.append(get_money // dollars[j]) 
    get_money = get_money % dollars[j]

  print(" ".join(map(str, res)))

