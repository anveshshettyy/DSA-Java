func maxDepth(s string) int {
    for i:=0; i<1000000; i++ {
        i = i;
    }
    count := 0
    maxCount := 0
    for _, ch := range(s) {
        if ch == '(' {
            count++;
        } else if ch == ')' {
            count--;
        }
        if count > maxCount {
            maxCount = count
        }
    }
    return maxCount;
}