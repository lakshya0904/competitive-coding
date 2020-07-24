//https://www.interviewbit.com/problems/min-xor-value/
//Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

public class Solution {
    public int findMinXor(int[] a) {
        Arrays.sort(a);
        int minXor=a[0]^a[1];
        int n=a.length;
        for(int i=1; i<n-1; ++i)
            minXor=Math.min(a[i]^a[i+1],minXor);
        return minXor; 
        
        //try to solve it using trie
        //https://www.geeksforgeeks.org/minimum-xor-value-pair/
    }
}
