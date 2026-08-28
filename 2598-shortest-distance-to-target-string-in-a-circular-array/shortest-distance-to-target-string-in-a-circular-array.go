func closestTarget(words []string, target string, startIndex int) int {
    res := math.MaxInt;
    n := len(words);
    for i := 0; i < n; i++ {
        if words[i] == target {
            len1 := startIndex - i;
            if len1 < 0 {
                len1 = -len1;
            }
            len2 := (n - len1);
            res = min(res, min(len1, len2));
        }
    }
    if res == math.MaxInt {
        return -1
    }
    return res  
}