func checkDivisibility(n int) bool {
    sum := 0; prod := 1; temp := n;
    for temp > 0 {
        rem := temp % 10
        temp /= 10
        sum += rem
        prod *= rem
    }

    return n % (sum + prod) == 0;
}