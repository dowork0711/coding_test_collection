# 주사위 게임

# loop를 돌려서 결과를 array에 저장하고 큰걸 찾아내

n = int(input())

res = []

for i in range(n):
  x, y, z = map(int, input().split())
  if x == y == z:
    res.append(10000 + (x*1000))
  elif x == y:
    res.append(1000 + (x*100))
  elif y == z:
    res.append(1000 + (y*100))
  elif x == z:
    res.append(1000 + (x*100))
  else:
    res.append(max(x, y, z) * 100)

print(max(res))
