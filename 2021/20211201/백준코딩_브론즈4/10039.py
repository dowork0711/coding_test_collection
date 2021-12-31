# 평균점수

sum = 0
for i in range(5):
  p = int(input())
  if p < 40:
    sum += 40
  else:
    sum += p

print(int(sum / 5))
