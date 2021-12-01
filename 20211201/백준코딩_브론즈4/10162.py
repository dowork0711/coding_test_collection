# 전자레인지

initial_time = int(input())

if initial_time % 10 != 0:
  print(-1)
else:
  t1 = t2 = t3 = 0
  t1 = initial_time // 300
  t2 = (initial_time % 300) // 60
  t3 = (initial_time % 300) % 60 // 10
  print(t1, t2, t3)
