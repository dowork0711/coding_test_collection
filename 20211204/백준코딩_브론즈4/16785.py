# ソーシャルゲーム (Social Game)

a, b, c = map(int, input().split())
count = total = 0

for i in range(1, c//a+2):
  if (c <= a*i + i//7 * b) : print(i); break