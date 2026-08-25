func missingMultiple(nums []int, k int) int {
    var tempArr [] int
    for i := 0; i < len(nums); i++ {
        tempArr = append(tempArr, nums[i])
    }

    temp := k
    for slices.Contains(tempArr, temp) {
        temp += k
    }

    return temp
}