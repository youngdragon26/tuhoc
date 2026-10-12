package ngay2;

public class tinhtongphantu {
    public static void main(String  []args){
        int []arr = {5,10,15,20};
        int tong = 0;
          for (int i=0; i< arr.length; i++){
            tong = tong + arr[i];
            System.out.println("tong:"+tong);
          }
    }
}
