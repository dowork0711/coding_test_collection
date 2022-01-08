# 6098 성실한 개미
'''
갈 수 있는 곳 == 0
못 가는 곳 == 1 == 장애물, 벽
먹이 == 2 == 갈 수 있어 ==> 멈춰야해

멈춰야할 조건
맨 아래의 가장 오른쪽에 도착한 경우
더 이상 움직일 수 없는 경우
'''

from sys import stdin
input = stdin.readline

board = [list(map(int, input().split())) for _ in range(10)]


# 개미집이 x, y에 있어
x = 1
y = 1

while True:
    if board[x][y] == 0:        # 갈 수 있는 곳
        board[x][y] = 9
    elif board[x][y] == 2:      # 먹이가 있는 곳
        board[x][y] = 9
        break                   # 먹이가 있는 곳에서 멈춰야 하니까

    # 장애물이나 벽이 있는 구간, 더 이상 갈 수 없는 구간
    if (board[x][y+1] == 1 and board[x+1][y] == 1) or (x == 9 and y == 9):
        break

    # 이동해야하는 경우
    if board[x][y+1] != 1:
        y += 1
    elif board[x+1][y] != 1:
        x += 1


for j in range(10):
    for k in range(10):
        print(board[j][k], end=" ")
    print()






