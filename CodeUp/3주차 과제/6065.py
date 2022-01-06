# 6065: 정수 3개 입력받아 짝수만 출력하기

num = map(int, input().split())
for n in num:
    if n % 2 == 0: print(n)