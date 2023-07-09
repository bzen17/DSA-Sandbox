# Time complexity: O(log n)
# Space complexity: O(1)

def main():
    matrix = [
        [2, 3, 4, 6],
        [16, 19, 33, 36],
        [37, 38, 38, 41],
        [47, 47, 50, 51],
        [55, 57, 58, 62],
        [63, 65, 66, 66],
        [68, 70, 75, 77],
        [78, 84, 84, 86],
        [86, 87, 88, 92],
        [94, 95, 96, 97],
    ]
    target = input("Enter your value: ")
    print(solution(matrix, int(target)))


def solution(matrix, target):
    i = 0
    j = len(matrix[0])-1
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
