# 파일 옮기기

apple_1, orange_1 = map(int, input().split())
apple_2, orange_2 = map(int, input().split())

print(min(apple_1 + orange_2, orange_1 + apple_2))
