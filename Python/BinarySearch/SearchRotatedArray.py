def main():
    arr = [9, 11, 13, 15, 17, 20, 22, 25, 2, 3, 5, 7]
    target = input("Enter your value: ")
    minIdx = findMin(arr)
    ans = binarySearch(arr, 0, minIdx-1, int(target))
    if (ans == -1):
        ans = binarySearch(arr, minIdx, len(arr)-1, int(target))
    print(ans)


def binarySearch(arr, left, right, target):
    while (left <= right):
        mid = int((left+right)/2)
        if (arr[mid] == target):
            return mid
        elif (arr[mid] < target):
            left = mid+1
        else:
            right = mid-1
    return -1


def findMin(arr):
    left = 0
    right = len(arr)-1
    while (left < right):
        mid = int((left+right)/2)
        if (arr[mid] < arr[right]):
            right = mid
        else:
            left = mid+1
    return left


main()
