# 지능형 기차 2

import sys

input = sys.stdin.readline


stations = []

for _ in range(10):
  a, b = map(int, input().split())

  stations.append([a, b])

x = 0
passenger = []
for st in stations:
  unload, load = st
  calc = load-unload
  x += calc
  passenger.append(x);

print(max(passenger))