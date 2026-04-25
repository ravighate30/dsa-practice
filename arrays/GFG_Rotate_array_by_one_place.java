

class Solution {
    public void rotate(int[] arr) {
        
        // code here
        int n=arr.length;
        if(n<=1) return;
        int lastElement = arr[n-1];
        for(int i=n-1; i>=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }
}
