class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLength = Math.max(len1,len2);
        char[] merged = new char[len1+len2];
        int index = 0;

        for(int i=0;i<maxLength;i++){
            if(i<len1)
                merged[index++] = word1.charAt(i);
            if(i<len2)
                merged[index++] = word2.charAt(i);
        }
        return new String(merged);
    }
}
