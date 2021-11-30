# 검증수

a, b, c, d, e = map(int, input().split())

a = a**2
b = b**2
c = c**2
d = d**2
e = e**2

p = (a+b+c+d+e)%10

print(p)