package Array;

public class prefixsum {
    public static int[] presum(int[] arr ){
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length ; i++){
                pre[i] = arr[i] + pre[i-1];
        }
        return pre;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] pre = presum(arr);
        for(int i = 0; i < pre.length - 1 ; i++ ){
            System.out.print(i + ",");
        }
        System.out.println(pre[pre.length-1]);
    }
}
