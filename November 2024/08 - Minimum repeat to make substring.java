class Solution {
    static int minRepeats(String s1, String s2) {
        // code here
        for(char ch : s2.toCharArray()){
            if(!s1.contains(Character.toString(ch))) return -1;
        }
        int count =0; 
        String newStr=" ";
        while(newStr.length() <= s2.length()*2){
            count++;
            newStr +=s1;
            if(newStr.contains(s2)) return count;
        }
        return -1;
    }
};
