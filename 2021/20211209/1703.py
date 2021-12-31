# 생장점

while True:
  li = list(map(int, input().split()))
  if li[0] == 0:
    break
  x = 1
  for i in range(li[0]):
    p = li[2*i + 1]
    q = li[2*i + 2]
    x = x*p - q

  print(x);

# 처음에 제출한 답(정답은 잘 나오는데 연달아서 나옴ㅋㅋ)
# li = list(map(int, input().split()))

# for _ in range(li[0]):
#   if li[0] == 0:
#     break
#   x = 1
#   for i in range(li[0]):
#     p = li[2*i + 1]
#     q = li[2*i + 2]
#     x = x*p - q

#   print(x);