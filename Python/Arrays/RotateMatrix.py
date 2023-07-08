def Rotate_Matrix():
    matrix = [
        [1, 2, 3, 4],
        [5, 6, 7, 8],
        [9, 10, 11, 12],
        [13, 14, 15, 16]
    ]
    print_matrix(matrix)
    print('------------')
    solution(matrix)
    print_matrix(matrix)


def print_matrix(m):
    for a in m:
        print(a)


def solution(m):
    for i in range(len(m)):
        for j in (range(i+1, len(m[0]))):
            temp = m[i][j]
            m[i][j] = m[j][i]
            m[j][i] = temp
    left = 0
    right = len(m[0])-1
    while (left < right):
        for i in range(len(m)):
            temp = m[i][left]
            m[i][left] = m[i][right]
            m[i][right] = temp
        left += 1
        right -= 1


Rotate_Matrix()
