class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer str = new StringBuffer();
        int total_len = word1.length()+word2.length();
        for(int i = 0;i<total_len;i++){
            if(i<word1.length())
                str.append(word1.charAt(i));
            if(i<word2.length())
                str.append(word2.charAt(i));
        }
        return str.toString();
    }
}

