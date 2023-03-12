import sys
from collections import deque
deq = deque()
n = int(sys.stdin.readline())
for _ in range(n):
    r = sys.stdin.readline()
    if r[0:3] == "pus":
        num = int(r.split(' ')[1])
        deq.appendleft(num)
    if r == "top\n":
        if deq:
            print(deq[0])
        else:
            print("-1")
    if r == "empty\n":
        if deq:
            print("0")
        else:
            print("1")
    if r == "size\n":
        print(len(deq))
    if r == "pop\n":
        if deq:
            print(deq.popleft())
        else:
            print("-1")


