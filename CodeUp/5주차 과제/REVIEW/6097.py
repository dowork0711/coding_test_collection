# 6097:설탕과자 뽑기

'''
2차원 배열 : index 0부터 시작
문제에서는 1부터보고 있음 ---> -1
'''

from sys import stdin
input = stdin.readline

h, w = map(int, input().split())
n = int(input())

board = [[0] * w for _ in range(h)]

for i in range(n):
    l, d, x, y = map(int, input().split())

    for j in range(l):
        '''
        방향(d)이 1 == 세로 ==> (2, 3) ==> 2, 3을 기준으로 막대 길이만큼 막대가 세로로
        방향(d)이 0 == 가로 ==> (2, 3) ==> 2, 3을 기준으로 막대 길이만큼 막대가 가로로
        '''
        if d == 0:
            board[x-1][y-1+j] = 1       # 가로니까 y축에 변화
        elif d == 1:
            board[x-1+j][y-1] = 1       # 세로니까 x축에 변화



for k in board:
    print(" ".join(map(str, k)))


'''
for k in range(h):
    for l in range(w):
        print(" ".join(repr(board[k][l])), end=" ")
    print(end="\n")
'''