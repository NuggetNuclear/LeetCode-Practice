class LC2185 {
    public int prefixCount(String[] words, String pref) {
        int length = pref.length();
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < pref.length() && j < words[i].length(); j++){
                if(words[i].charAt(j) != pref.charAt(j)) {
                    break;
                }
                if(j == pref.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
