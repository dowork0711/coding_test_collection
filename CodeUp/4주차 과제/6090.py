# 6090: 수 나열하기3

a, m, d, n = map(int, input().split())

for i in range(0, n-1):
    a = a*m+d

print(a)