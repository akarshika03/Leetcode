import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);

        if( Arrays.equals(S,T)){
            return true;
        }
        return false;

    }
}