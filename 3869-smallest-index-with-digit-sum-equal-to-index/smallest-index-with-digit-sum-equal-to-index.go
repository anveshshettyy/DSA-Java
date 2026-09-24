func smallestIndex(nums []int) int {
    for idx, num := range nums {
        sum := 0
        for num > 0 {
            sum += num % 10
            num /= 10
        }
        if sum == idx {
            return idx
        }
    }
    return -1
}