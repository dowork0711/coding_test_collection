# 베시와 데이지

br, bc = map(int, input().split())
dr, dc = map(int, input().split())
jr, jc = map(int, input().split())

# 존의 좌표에서 각각의 좌표를 뺀 x, y의 절대값 중 큰게 베시의 최소 이동거리
b_min = max(abs(jr-br), abs(jc-bc))

# 존의 좌표에서 각각의 좌표를 뺀 x, y의 절대값을 더한게 데이지의 최소 이동거리
d_min = abs(jr-dr) + abs(jc-dc)

if b_min < d_min:
  print('bessie')
elif b_min == d_min:
  print('tie')
else:
  print('daisy')
