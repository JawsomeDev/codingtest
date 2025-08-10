package ct.week01;

public class Ex08 {
    public static void main(String[] args) {
        int i = 0 ;
        int j = 0 ;
        while(i > 5){
            System.out.println("출력");
            i++;

            do{
                System.out.println(i++);
            }while(i > 5);
        }
    }
}
