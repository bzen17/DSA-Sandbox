def FirstLastIndex():
    arr = [1, 1, 2, 3, 5, 5, 5, 5, 5, 5, 7, 7, 7, 7, 7, 8, 8]
    target = 7
    Solution(arr, target)

# Time complexity: O(log n)
# Space complexity: O(1)


def Solution(arr, target):
    first = last = -1
    left = 0
    right = len(arr) - 1
    print(arr)
    while (left <= right):
        mid = int(left + (right-left)/2)
        if (arr[mid] == target):
            if (first == -1):
                if (arr[mid-1] < target):
                    first = mid
                    left = mid + 1
                    right = len(arr) - 1
                else:
                    right = mid - 1
            else:
                if (arr[mid+1] > target):
                    last = mid
                    print("{} {}".format(first, last))
                    break
                else:
                    left = mid + 1
        elif (arr[mid] < target):
            left = mid + 1
        else:
            right = mid - 1


FirstLastIndex()
