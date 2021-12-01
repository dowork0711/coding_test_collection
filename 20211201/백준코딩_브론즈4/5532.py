# 방학숙제
## 변수명 메모
### L = 방학일 수
### B = 수학 풀어야할 분량
### A = 국어 풀어야할 분량
### C = 국어 풀 수 있는 하루 최대 페이지
### D = 수학 풀 수 있는 하루 최대 페이지

L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

def can_play(p, q):
  if p % q == 0:
    return p // q
  else:
    return p // q + 1

print(L - max(can_play(A, C), can_play(B, D)))
