class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int arr2 [] = new int [n];
        int j =0, i =0;

        while(i < n && j < n){
            if(arr[i] != 0){
                arr2[j] = arr[i];
                j++;
            }else{
                arr2[j] = 0;  
                j++;
                if (j < n) {  
                    arr2[j] = 0;
                    j++;
                }
            }
            i++;
        }

        for(int a =0; a<n; a++){
            arr[a] = arr2[a];
        }
    }
}