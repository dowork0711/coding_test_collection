import sys
# 지능형 기차

input = sys.stdin.readline

#stationLoad, stationUnload
stations = []
# max_value = -1

for _ in range(4):
  a, b = map(int, input().split())

  stations.append([a, b])

x = 0
passenger = []
for st in stations:
  unload, load = st
  x += (load-unload)
  passenger.append(x);

print(max(passenger))






# 1: 0 32
# 2: 3 13
# 3: 28 25
# 4: 39 0

