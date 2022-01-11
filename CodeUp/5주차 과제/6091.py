# 6091: 함께 문제 푸는 날


# codeup의 python 컴파일러 버전이 3.9미만이라 lcm함수 미지원
'''
import math
a, b, c = map(int, input().split())
print(math.lcm(a, b, c))
'''


a, b, c = map(int, input().split())

# 최대 공약수 --> 최소 공배수 계산할 때 필요
def getGcd(x, y):
    while y != 0:
        temp = x % y
        x = y
        y = temp
    return abs(x)

# 최소 공배수
def getLcm(x, y):
    gcdValue = getGcd(x, y)
    if gcdValue == 0:     # params가 둘 다 0일 때 0을 반환
        return 0
    return abs((x * y) / gcdValue)

print(int(getLcm(a, getLcm(b, c))))
