package ct.week01;

public class Ex10 {
    public static void main(String[] args) {
        String s = "AGood Morning";

        System.out.println("charAt : " + s.charAt(7));
        System.out.println("startsWith : " + s.startsWith("good"));
        System.out.println("endsWith : " + s.endsWith("morning"));
        System.out.println("equals : " + s.equals("good Morning"));
        System.out.println("indexOf : " + s.indexOf("n"));
        System.out.println("lastIndexOf : " + s.lastIndexOf("n"));
        System.out.println("length : " + s.length());
    }
}
