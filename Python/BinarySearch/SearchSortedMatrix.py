# Time complexity: O(log n)
# Space complexity: O(1)

def main():
    matrix = [
        [1, 4, 6, 8, 10],
        [2, 7, 9, 12, 15],
        [3, 11, 20, 22, 24],
        [5, 16, 25, 30, 40]
    ]
    target = input("Enter your value: ")
    print(solution(matrix, int(target)))


def solution(matrix, target):
    i = 0
    j = len(matrix)-1
    ans = [-1, -1]
    while (i < len(matrix) and j >= 0):
        if (matrix[i][j] == target):
            ans[0] = i
            ans[1] = j
            return ans
        elif (matrix[i][j] < target):
            i += 1
        else:
            j -= 1

    return ans


main()
