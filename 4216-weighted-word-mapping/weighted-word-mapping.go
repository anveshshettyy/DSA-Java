func mapWordWeights(words []string, weights []int) string {
    var res strings.Builder
    for _, word := range words {
        sum := 0
        for _, ch := range word {
            sum += weights[ch - 'a']
        }
        sum %= 26
        res.WriteByte(byte('z' - sum))
    }
    return res.String()
}