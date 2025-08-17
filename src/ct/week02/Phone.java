package ct.week02;

abstract class Phone{

    private String number = "010-1234-5678";

    public abstract void call();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

class SmartPhone extends Phone {
    public String getName(){
        return "스마트폰";
    }

    @Override
    public void call() {
        System.out.println(this.getName() + "에서 " + this.getNumber() + "로 전화를 겁니다.");
    }

    public class CallPhone{
        public static void main(String[] args) {
            SmartPhone sm = new SmartPhone();
            sm.call();
        }
    }
}