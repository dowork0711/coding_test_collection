numArr = [list(map(int, input().split())) for _ in range(int(input()))]

numArr.sort(key=lambda num: (num[0], num[1]))

for i in numArr:
    print(i[0], i[1])

# n = int(input())
# arr = []
# for i in range(n):
#     x, y = map(int, input().split())
#     arr.append((x, y))

# arr.sort()

# for i in range(n):
#     print(arr[i][0], arr[i][1])

'''
numArr = [
    [ 3, 4 ],
    [ 1, 1 ],
    [ 1, -1 ],
    [ 2, 2 ],
    [ 3,  3]
]

const datas = [
    {
        id: 1,
        name: "0000"
    },
    {
        id: 2,
        name: "XXX"
    }
]

datas.map((data) => console.log(data))
'''