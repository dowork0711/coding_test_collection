# 2 番目に大きい整数 (The Second Largest Integer)

# 나의 답안
value = sorted(list(map(int, input().split())))
print((value[1:2])[0])

# 모범답안
print(sorted(list(map(int, input().split())))[1])