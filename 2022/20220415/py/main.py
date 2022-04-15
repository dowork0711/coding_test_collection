# 좌표를 넣어줄 배열
numArr = [list(map(int, input().split())) for _ in range(int(input()))]

# 정렬
numArr.sort(key=lambda num: (num[0], num[1]))

# 출력
for i in numArr:
    print(i[0], i[1])