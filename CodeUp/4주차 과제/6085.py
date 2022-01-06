# 6085: 그림 파일 저장용량 계산하기

r, g, b = map(int, input().split())

size = (r * g * b) / 8 / 1024 / 1024

print("%.2f MB" %size)
# print(f'{size:.2f}', "MB")
# print(f'{result:.2f} MB')