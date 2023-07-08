
def majority_element():
    n = input("Enter your value: ")
    arr = [5, 7, 4, 7, 4, 3, 7, 4, 4, 7, 7, 2, 5, 7]
    print(solution(arr, int(n)))

# Time complexity: O(n)
# Space complexity: O(1)


def solution(a, n):
    map = dict()
    for i in range(len(a)):
        if (a[i] in map):
            map[a[i]] += 1
        else:
            map[a[i]] = 1
        if (map[a[i]] == n/2):
            return a[i]
    return -1


majority_element()
