public class Solution {
    private int lo=0, hi=0, maxLen=0;
    public String longestPalindrome(String A) {
        if(A==null || A.length()==0){
            return A;
        }
        if(A.length()==1)
            return A;
        for(int i=0; i<A.length(); ++i){
            chkPalindrome(A,i,i+1);
            chkPalindrome(A,i,i);
        }    
        return A.substring(lo,hi+1);
    }
    public void chkPalindrome(String s, int j, int k){
        if(k<s.length()){
            while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k) ){
                if(k-j+1>maxLen){
                    maxLen=k-j+1;
                    lo=j;
                    hi=k;
                }
                j--;
                k++;
            }
        }
    }
}

Source: https://www.interviewbit.com/problems/longest-palindromic-substring/
Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

Example :

Input : "aaaabaaa"
Output : "aaabaaa"
