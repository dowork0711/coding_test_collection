# 파티가 끝나고 난 뒤

person, width  = map(int, input().split())
num = list(map(int, input().split()))

for i in num:
  print(i - person * width, end=' ')
