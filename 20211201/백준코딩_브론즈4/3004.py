# 체스판 조각

def solution ():
  n = int(input())
  row = int(n/2)
  col = n - row
  return (row+1)*(col+1)

res = solution()
print(res)
