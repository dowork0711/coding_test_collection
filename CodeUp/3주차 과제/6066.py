# 6066: 정수 3개 입력받아 짝/홀 출력하기

num = map(int, input().split())
for n in num:
    print("even" if n % 2 == 0 else "odd")