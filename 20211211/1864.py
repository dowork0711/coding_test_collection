# 문어 숫자

while True:

  n = input()

  if n == '#':
    break

  else:
    dict = { "-": 0, "\\": 1, "(": 2, "@": 3, "?": 4, ">": 5, "&": 6, "%": 7, "/": -1 }

    res = 0
    for i in range(len(n)):
      res += dict[n[i]] * 8 ** (len(n)-i-1)

    print(res)