# 약수 구하기

'''
1, 2, 3, 6       3
1, 5, 25, x      k = 4
배열의 길이?
'''

n, k = map(int, input().split())
arr = []

for i in range(1, n+1):
  if n % i == 0:
    arr.append(i)

if k > len(arr):
  print(0)
else:
  print(arr[k-1])

