# 꼬리를 무는 숫자 나열

p, q = map(int, input().split())

p -= 1
q -= 1

print(abs(p//4 - q//4) + abs(p%4 - q%4))