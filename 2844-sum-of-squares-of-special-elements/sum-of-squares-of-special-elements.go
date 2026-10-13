func sumOfSquares(nums []int) int {
    res := 0
    for idx, num := range(nums) {
        if  len(nums) % (idx+1) == 0 {
            res += num * num
        }
    }
    return res
}