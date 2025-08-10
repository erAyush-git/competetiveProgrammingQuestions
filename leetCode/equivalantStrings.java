/*Given two string arrays word1 and word2,
 return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements 
concatenated in order forms the string. 

leetcode : 1662*/


public class equivalantStrings {
    public static void main(String[] args) {
        
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s : word1){
            sb1.append(s);
        }
        for(String s2 : word2){
            sb2.append(s2);
        }
        if(sb1.toString().equals(sb2.toString())) return true;
        else return false;
    }
    /*Slow */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1joined = "";
        String word2joined = "";
        
        for(String word : word1){
            word1joined += word;
        }
        for(String wordString : word2){
            word2joined += wordString;
        }

        if(word1joined.equalsIgnoreCase(word2joined)) return true;
        else return false;
    }
}
