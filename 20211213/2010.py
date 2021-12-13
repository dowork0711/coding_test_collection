# 플러그

n = int(input())

p = 0;    # 멀티탭에 꽂을 수 있는 콘센트 개수

for _ in range(n):
  p += int(input())   # n만큼 입력받아서 p에 저장

print(p - (n-1))      # 멀티탭에 다른 멀티탭을 꽂으면 그 칸은 쓸 수 없으니까 -1