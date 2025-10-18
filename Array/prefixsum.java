package Array;

public class prefixsum {
    public static int[] presum(int[] arr ){
        int[] pre = new int[arr.length];
        for (int i = 0; i < arr.length ; i++){
            if(i==0){
                pre[i]= arr[i];
            }
            else{
                pre[i] = arr[i] + pre[i-1];
            }
        }
        return pre;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] pre = presum(arr);
        for(int i : pre){
            System.out.print(i + ",");
        }
    }
}
