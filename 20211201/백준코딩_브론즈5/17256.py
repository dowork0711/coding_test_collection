# 달달함이 넘쳐흘러

A = list(map(int, input().split()))
C = list(map(int, input().split()))
B = []

B.append(C[0] - A[2])
B.append(C[1] // A[1])
B.append(C[2] - A[0])

for i in B:
  print(i, end=" ")
