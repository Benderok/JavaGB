from random import randint
import time

def perebor(x):
    start = time.time()
    for i in range(upper+1):
        if i == x:
            break
    fin = time.time()
    print(f"Число отгадано и это {i} за {i} итераций")
    print(f"Времени ушло {fin-start}")
    print()

def random_guess(x):
    start = time.time()
    k = 1
    num = randint(0, upper)
    while x != num:
        num = randint(0, upper)
        k +=1
    fin = time.time()
    print(f"Число отгадано и это {num} за {k} итераций")
    print(f"Времени ушло {fin - start}")
    print()

def smart_random_guess(x):
    start = time.time()
    k = 1
    num = randint(0, upper)
    s = {num}
    while x != num:
        while num in s:
            num = randint(0, upper)
        s.add(num)
        k += 1
    fin = time.time()
    print(f"Число отгадано и это {num} за {k} итераций")
    print(f"Времени ушло {fin - start}")
    print()

def from_list(x):
    start = time.time()
    k = 0
    sp =[x for x in range(upper+1)]
    a = None
    while a != x:
        index = randint(0, len(sp) - 1)
        a = sp.pop(index)
        k += 1
    fin = time.time()
    print(f"Число отгадано и это {a} за {k} итераций")
    print(f"Времени ушло {fin - start}")
    print()

def binary_search(x):
    start = time.time()
    k = 1
    left = 0
    right = upper
    current = round ( (right + left) / 2)
    while current != x:
        if current < x:
            left = current + 1
        else:
            right = current - 1
        current = round ( (right + left) / 2)
        k += 1
        # print(f"Left: {left} Right: {right} Current: {current} ")
        # input()
    fin = time.time()
    print(f"Число отгадано и это {current} за {k} итераций")
    print(f"Времени ушло {fin - start}")
    print()


upper = 100000

x = randint(0,upper)

perebor(x)
random_guess(x)
smart_random_guess(x)
from_list(x)
binary_search(x)
