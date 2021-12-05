# 金平糖 (Konpeito)

a, b, c = map(int, input().split())
max_candy = max(a, b, c)
res = (max_candy - a) + (max_candy - b) + (max_candy - c)
print(res)
