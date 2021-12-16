# 윷놀이

'''
배 : 0    
등 : 1    

도 A 
개 B
걸 C
윷 D
모 E

0의 개수를 기준으로
0 1 0 1 == B
1 1 1 0 == A
0 0 1 1 == B
'''

for i in range(3):
  yut = list(map(int, input().split()))
  if yut.count(0) == 1:
    print("A")
  elif yut.count(0) == 2:
    print("B")
  elif yut.count(0) == 3:
    print("C")
  elif yut.count(0) == 4:
    print("D")
  else:
    print("E")