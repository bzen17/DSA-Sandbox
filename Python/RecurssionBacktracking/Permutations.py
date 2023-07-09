
# Time complexity: O(n!n)
# Space complexity: O(n)

def main():
    arr = [1, 2, 3]
    selected = [False for i in range(len(arr))]
    ans = []
    printPermutations(arr, 0, selected, ans)


def printPermutations(arr, pos, selected, ans):
    if (pos == len(arr)):
        print(ans)
        return
    for i in range(len(arr)):
        if (selected[i] == False):
            selected[i] = True
            ans.append(arr[i])
            printPermutations(arr, pos+1, selected, ans)
            selected[i] = False
            ans.pop()


Solution()
