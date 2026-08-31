func minimumDeletions(nums []int) int {
    minIdx := 0
    maxIdx := 0
    n := len(nums) 
    for idx, val := range nums {
        if val < nums[minIdx] {
            minIdx = idx
        }
        if val > nums[maxIdx] {
            maxIdx = idx
        }
    }

    left := min(maxIdx, minIdx)
    right := max(maxIdx, minIdx)

    option1 := right + 1
    option2 := n - left
    option3 := (left + 1) + (n - right)

    return min(option1, min(option2, option3))
}