
def TwoSum():
    arr = [11,3,7,9,14,2]
    target = 17
    ans = []
    map = dict()
    for i in range(len(arr)):            
        second_num = target - arr[i]
        if (second_num in map):
            ans.append(map[second_num])
            ans.append(i)
            break
        map[arr[i]] = i
    print(str(ans[0]) + " " + str(ans[1]))

TwoSum()