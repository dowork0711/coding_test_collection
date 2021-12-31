# 과목 선택

li = []

for _ in range(6):
  li.append(int(input()))

li_1 = sorted(li[:4])
li_2 = li[4:]

print(sum(li_1[1:]) + max(li_2))

