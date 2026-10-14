package ngay3;

public class songuyento {
    public static boolean songuyento(int a){
        if (a<2) return false;
        for (int i = 2; i<=Math.sqrt(a); i++){
            if (a % i == 0)  return false;
        }
        return true;
    }
    public static void main (String []args){
        System.out.println("so nguyen to la:");
        for (int i = 2; i <=100;  i++){
            if (songuyento(i)){
                System.out.print(i + " ");
            }
        }
    }
}
