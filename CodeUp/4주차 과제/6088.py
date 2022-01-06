# 6088: 수 나열하기1

a, d, n = map(int, input().split())
print(a + d * (n-1))            # 등차수열의 일반항

'''
a, d, n = map(int, input().split())
answer = a

for i in range(0, n-1):
    answer = answer + d

print(answer)
'''