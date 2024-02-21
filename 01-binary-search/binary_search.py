def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        if arr[mid] > target:
            high = mid - 1
        else:
            low = mid + 1
    return -1

my_list = list(range(1,10,2))
print(binary_search(my_list, -2))