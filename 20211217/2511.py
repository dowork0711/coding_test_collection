# 2511 카드놀이

'''
10게임
높은 숫자가 나오면 3점
같은 숫자가 나오면 1점
'''

import sys

# 카드 숫자 입력 받기
A = list(map(int, input().split()))
B = list(map(int, input().split()))

if A == B:
  print(10, 10)
  print("D")
  sys.exit()

A_score = 0
B_score = 0

winner = ""

# 점수 비교
for i in range(10):
  if A[i] > B[i]:
    A_score += 3
    winner = "A"
  elif A[i] < B[i]:
    B_score += 3
    winner = "B"
  else:
    A_score += 1
    B_score += 1

print(A_score, B_score)

if A_score > B_score:
  print("A")
elif A_score < B_score:
  print("B")
else:
  print(winner)


# # 숫자들 비교하기
# for i in range(10):
#   if A[i] > B[i]:         # A가 이긴 경우
#     result.append("A")
#   elif A[i] < B[i]:       # B가 이긴 경우
#     result.append("B")
#   else:                   # 무승부
#     result.append("D")

# # print(result)

# # 배열 안의 요소들 개수만큼 숫자 곱해주기
# A_score = result.count("A") * 3 + result.count("D") #* 1
# B_score = result.count("B") * 3 + result.count("D") #* 1

# # 각각의 점수 출력
# print(A_score, B_score)

# # 누가 이겼나?
# if A_score > B_score:
#   print("A")
# elif A_score < B_score:
#   print("B")
# elif A_score == B_score:
#   print("D")
# else:           # 점수가 같다면 마지막 게임에서 높은 점수를 받은 사람이 우승
#   for i in range(-1, -9, -1):
#     if result[i] != "D":
#       print(result[i])
#       break