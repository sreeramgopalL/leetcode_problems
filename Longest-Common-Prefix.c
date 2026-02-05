1char* longestCommonPrefix(char** strs, int strsSize) {
2    if (strsSize == 0) return ""; 
3    if (strsSize == 1) return strs[0]; 
4
5    
6    char* prefix = strs[0];
7    int prefixLength = strlen(prefix);
8
9    for (int i = 1; i < strsSize; i++) {
10        
11        while (strncmp(prefix, strs[i], prefixLength) != 0) {
12           
13            prefixLength--;
14            prefix[prefixLength] = '\0';
15            if (prefixLength == 0) return ""; 
16        }
17    }
18
19    return prefix; 
20}
21