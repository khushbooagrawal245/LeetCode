class Solution {
public int balancedStringSplit(String s) {
int total = 0;
int repeated = 0;
for (int i = 0; i < s.length(); i++) {
repeated += s.charAt(i) == 'R' ? 1 : -1;
if (repeated == 0) total++;
}
return total;
}
}