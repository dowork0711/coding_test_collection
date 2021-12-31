# 자전거 속도

import sys
from math import pi

input = sys.stdin.readline

index = 1;
while 1:
    dis, r, time = map(float, input().split())
    if r == 0:
        break
    dist = dis / 63360 * pi * r
    mph = dist / time * 3600
    print("Trip #%d: %.2f %.2f" % (index, dist, mph))
    index += 1