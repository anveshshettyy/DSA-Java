int lengthOfLastWord(char* s) {
    int length, i, count = 0;
    length = strlen(s);
    i = length - 1;
    while (s[i] == ' ')
        i--;

    while (i >= 0 && s[i] != ' ') {
        count++;
        i--;
    }
    return count;
}