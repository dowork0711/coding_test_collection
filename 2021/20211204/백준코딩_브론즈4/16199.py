# 나이 계산하기

by, bm, bd = map(int, input().split())
dy, dm, dd = map(int, input().split())

age = 0

if bm < dm:
  age = dy-by
elif bm == dm:
  if bd <= dd:
    age = dy - by
  else:
    age = dy - by - 1
else:
  age = dy - by - 1

count_age = dy - by + 1
year_age = dy - by

print(age)
print(count_age)
print(year_age)
