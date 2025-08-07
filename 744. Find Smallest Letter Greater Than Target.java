class Solution {
    public char nextGreatestLetter(char[] a, char target) {
        int n=a.length;
        if(target>=a[n-1]){
            target=a[0];
        }else{
            target++;
        }
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(a[mid]==target){
                return a[mid];
            }else if(a[mid]<target){
                left=mid+1;
            }else{
                right=mid;            }
        }
        return a[right];

        
    }
}