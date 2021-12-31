# Do Not Touch Anything

r, c, n = map(int, input().split())

p = r//n + 1 if r%n else r//n
q = c//n + 1 if c%n else c//n

print(p*q)
