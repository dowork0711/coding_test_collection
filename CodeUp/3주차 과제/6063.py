# 6063: 정수 2개 입력받아 큰 값 출력하기

a, b = map(int, input().split())
print(a if a > b else b)