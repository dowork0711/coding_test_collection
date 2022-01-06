# 6093: 이상한 출석번호 부르기2

n = int(input())
# li = list(map(int, input().split()))

print(" ".join(repr(i) for i in reversed(list(map(int, input().split())))))