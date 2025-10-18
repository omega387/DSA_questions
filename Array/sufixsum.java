package Array;

public class sufixsum {
    public static int[] sufsum(int[] arr){
        int[] suf = new int[arr.length];
        suf[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            suf[i] = suf[i+1] + arr[i];
        }
        return suf;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] suf = sufsum(arr);
        for(int i = 0; i < suf.length - 1 ; i++ ){
            System.out.print(suf[i] + ",");
        }
        System.out.println(suf[suf.length-1]);
    }
}
