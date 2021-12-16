# 구구단

N = int(input())
for i in range(N, 10):
    for k in range(1, N):
        print(f'{i} * {k} = {i*k}')
