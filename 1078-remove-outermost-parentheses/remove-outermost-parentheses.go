func removeOuterParentheses(s string) string {
    open := 0
    var res strings.Builder
    for _, c:= range s {
        if c == '(' {
            open++
            if open > 1 {
                res.WriteRune(c)
            }
        } else {
            open--
            if open > 0 {
                res.WriteRune(c)
            }
        }
    }
    return res.String()
}