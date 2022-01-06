## 6054: 둘 다 참일 경우만 참 출력하기
a, b = map(int, input().split())
print(True if bool(a) and bool(b) else False)