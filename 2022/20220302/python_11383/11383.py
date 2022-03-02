n, m = map(int, input().split())

firImg = [input() for _ in range(n)]
secImg = [input() for _ in range(n)]

checker = True

for i in range(n):
    ref = ""
    for j in firImg[i]:
        ref += j * 2
    if ref != secImg[i]:
        checker = False
        break

print("Eyfa" if checker else "Not Eyfa")