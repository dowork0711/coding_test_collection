# 팀 나누기

a, b, c, d = map(int, input().split())
print(min(abs(a+b-c-d), abs(a+c-b-d), abs(a+d-c-b)))
