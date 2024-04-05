package main

import "fmt"

func twoSum(nums []int, target int) [] int {
	res := []int{0,0}
	l := len(nums)

	for i := 0; i < l-1; i++ {
		for j := i+1; j < l; j++ {
			if nums[i] + nums[j] == target {
				res[0] = i
				res[1] = j
				return res
			}
		} 
	}
	return res 
}

// func twoSum(nums []int, target int) {
// 	ans := make(map[int]int)
// 	for i, num := range nums {
// 		if index
// 	}
// }

func main() {
	fmt.Println(twoSum([]int{2,7,11,15},9))
}