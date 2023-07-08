
# Time complexity: O(log n)
# Space complexity: O(1)

def SmallestNum1():
    n = input("Enter your value: ")
    print(solution(int(n)))


def solution(n):
    ans = ""
    for i in range(9, 2, -1):
        while (n % i == 0):
            n = n/i
            ans = str(i) + ans
    if (n != 1):
        return -1
    else:
        return int(ans)


SmallestNum1()
