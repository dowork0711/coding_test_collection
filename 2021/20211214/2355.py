# 시그마

## 등차수열의 합?

p, q = map(int, input().split())

maxNum = max(p, q)
minNum = min(p, q)

x = maxNum - minNum

s = (x * (x + 1)) // 2
print(s + (minNum * (x + 1)))