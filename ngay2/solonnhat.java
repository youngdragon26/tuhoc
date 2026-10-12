package ngay2;

public class solonnhat {
    public static void main (String []args){
        int[] arr = {1,3,2,5,6,9,6,7};
        int max = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("so lon nhat:"+max);
    }
}
