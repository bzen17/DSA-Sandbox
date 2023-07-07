# Time complexity: O(n^2)
# Space complexity: O(1)

def ThreeSum():
    arr = [7, -6, 3, 8, -1, 8, -11]
    target = 0
    Solution(arr, target, len(arr))


def Solution(a, target, n):
    a.sort()
    for i in range(n):
        if (i == 0 or a[i] != a[i-1]):
            j = i+1
            k = n - 1
            tar = target - a[i]
            while (j < k):
                two_sum = a[j] + a[k]
                if (two_sum == tar):
                    print("{} {} {}".format(a[i], a[j], a[k]))
                    while (j < k and a[j] == a[j+1]):
                        j += 1
                    while (j < k and a[k] == a[k-1]):
                        k -= 1
                    j += 1
                    k -= 1
                elif (two_sum < tar):
                    j += 1
                else:
                    k -= 1


ThreeSum()
