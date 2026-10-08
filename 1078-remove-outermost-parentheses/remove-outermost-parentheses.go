func removeOuterParentheses(s string) string {
    open := 0
    res := ""
    for _, c:= range s {
        if c == '(' {
            open++
            if open > 1 {
                res += string(c)
            }
        } else {
            open--
            if open > 0 {
                res += string(c)
            }
        }
    }
    return res
}