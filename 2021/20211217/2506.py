# 점수계산

'''
1번 문제 O == 1점
처음 정답 == 1점
연속 정답, (2, 2), (3, 3) ... (k, k) k번째 문제 k점
틀린 문제 0점
'''

n = int(input())

mark = list(map(int, input().split()))

score = []

sumNum = 0

res = 0

for i in range(len(mark)):
  if mark[i] == 1:
    sumNum += 1
    res += sumNum
    score.append(res)
  else:
    sumNum = 0

print(max(score))
