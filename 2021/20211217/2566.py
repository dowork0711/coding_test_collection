# 최댓값

'''
[
  [3, 23, 85, 34, 17, 74, 25, 52, 65],
  [10, 7, 39, 42, 88, 52, 14, 72, 63],
              :
              :
]
'''



main = []

x = 0
y = 0

for i in range(9):
  row = list(map(int, input().split()))
  main.append(row)

max_num = main[0][0]

for j in range(9):
  for k in range(9):
    if main[j][k] > max_num:
      max_num = main[j][k]
      x = j+1
      y = k+1

print(max_num)
print(x, y)
      
      

