# 암호제작

p, k = map(int, input().split())

## 에라토스테네스의 채
k -= 1
a = [False, False] + [True]*(k-1)
primes=[]

for i in range(2, k+1):
  if a[i]:
    primes.append(i)
    for j in range(2*i, k+1, i):
      a[j] = False

res = 'GOOD'

for temp in primes:
  if p % temp == 0:
    res = f'BAD {temp}'
    break

print(res)