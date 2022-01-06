# 6086: 거기까지! 이제 그만~

num = int(input())
res = 0

for i in range(1, num+1):
    res += i                ## res에 i만큼 더한 값이
    if res >= num:          ## 입력 받은 값보다 크거나 같으면
        print(res)          ## 출력해주고
        break               ## 멈춰

'''
int1 = int(input())
sum = 0
i=1

while (sum < int1) :
    sum += i
    i += 1
print(sum)
'''

'''
floor = int(input().rstrip())
MAX_VAL = 10 ** 9

for i in range(1, MAX_VAL):
    if (i * (i + 1)) // 2 >= floor:
        print(i * (i + 1) // 2)
        break
'''