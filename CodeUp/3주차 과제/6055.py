# 6055: 하나라도 참이면 참 출력하기
a, b = map(int, input().split())
print(True if bool(a) or bool(b) else False)