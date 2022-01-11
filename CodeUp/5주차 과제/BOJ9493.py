from sys import stdin
input = stdin.readline

while True:
  m, a, b = map(int, input().split())
  if m == a == b:
    break

  time = round((m/a - m/b)*3600)

  h = time // 3600
  m = (time % 3600) // 60
  s = time % 60

  print("{}:{:02}:{:02}".format(h, m, s))