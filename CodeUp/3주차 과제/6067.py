# 6067: 정수 1개 입력받아 분류하기

num = int(input())

if num < 0:
    if num % 2 == 0:
        print("A")
    else:
        print("B")
else:
    if num % 2 == 0:
        print("C")
    else:
        print("D")