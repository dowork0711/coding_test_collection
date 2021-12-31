# 3 つの整数 (Three Integers)

# 문제
## 세 개의 정수 a, b, c가 주어진다. 각각 1 또는 2이다. 1과 2중 어느쪽이 많은가?

# 입력
## 입력은 이하의 형식으로 표준입력이 주어진다
### a b c

# 출력
## 1과 2 중 개수가 많은 쪽은 출력해라!

a, b, c = map(int, input().split())

print(2 if a+b+c > 4 else 1)

