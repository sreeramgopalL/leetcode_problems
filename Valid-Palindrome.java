1class Solution {
2public:
3    bool isPalindrome(string s) {
4          string t;
5        
6        // Keep only alphanumeric characters and convert to lowercase
7        for (char c : s) {
8            if (isalnum(c)) {  // ✅ Check if c is a letter or digit
9                t.push_back(tolower(c));  // ✅ Convert uppercase to lowercase
10            }
11        }
12
13        // Two-pointer palindrome check
14        int i = 0, j = t.size() - 1;
15        while (i < j) {
16            if (t[i] != t[j]) {
17                return false;
18            }
19            i++;
20            j--;
21        }
22        
23        return true;
24    }
25};