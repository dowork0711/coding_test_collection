# 6080: 주사위 2개 던지기

n, m = map(int, input().split())

for i in range(1, n+1):             # 1부터 n+1까지
    for j in range(1, m+1):         # 1부터 m+1까지
        print(i, j)                # i, j각각 출력