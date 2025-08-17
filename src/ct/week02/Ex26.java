package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("spring", "1234");
        map.put("summer", "5678");
        map.put("fall", "9012");
        map.put("winter", "3456");
        Scanner sc = new Scanner(System.in);
        int failCnt = 0;
        while(true){
            System.out.println("아이디와 비밀번호 입력 : ");
            System.out.println("아이디 : ");
            String id = sc.nextLine();
            System.out.println("비밀번호 : ");
            String pswd = sc.nextLine();
            if(map.containsKey(id)){
                if(map.get(id).equals(pswd)){
                    System.out.println("로그인 성공!!");
                }
            }else {
                failCnt++;
                System.out.println("아이디가 존재하지 않음!!");
            }
        }
    }
}
