package recursion;

public class nprints {

    public static void nprint(String msg,int times) {

        if(times>=1){
            System.out.println(msg);
            nprint(msg,times-1);
        }
    }
    public static void main(String[] args) {}
}
