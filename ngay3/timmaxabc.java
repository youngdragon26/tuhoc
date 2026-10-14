package ngay3;

public class timmaxabc {
    public static int timMax (int a, int b, int c){
        int max = a;
        if ( b > max){
            max = b;
        }
        if ( c > max){
            max = c;
        }
        return max;
    }
    public static void main(String []args){
        int a = 10;
        int b = 30;
        int c = 100;
        int max = timMax(a,b,c);
        System.out.println("so lon nhat la:"+max);
    }  
}
