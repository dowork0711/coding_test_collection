# 구구단
for i in range(2, 10):
    for j in range(1, 10):
        print(f"{i} × {j} = {i*j}")
'''
for(let i = 2; i < 10; i++) {
    for(let j = 1; j < 10; j++) {
        console.log(`${i} × ${j} = ${i * j}`)
    }
}
'''

# 별찍기
for i in range(1, 11, 2):
    print('{:^10}'.format('*' * i))
for j in range(9, 0, -2):
    print('{:^10}'.format('*' * j))