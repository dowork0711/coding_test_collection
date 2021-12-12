# Number Game


from sys import stdin

# 함수는 p % q가 0이면 1 + 함수연산결과를 return한다
def f(p, q):
  return 1 + f(p//q, q) if p % q == 0 else 0

for _ in range(int(stdin.readline())):
  N = int(stdin.readline())
  count = 0
  for i in range(2, N+1):
    count += f(N, i)
  
  print(count)