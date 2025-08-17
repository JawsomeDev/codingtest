package ct.week02;

public class Board {

    private int no = 0;
    private String title = "";
    private String cn = "";
    private String writer = "";

    public Board() {
    }

    public Board(int no, String title, String cn, String writer) {
        this.no = no;
        this.title = title;
        this.cn = cn;
        this.writer = writer;
    }

    public Board(int no, String title, String cn) {
        this.no = no;
        this.title = title;
        this.cn = cn;
        this.writer = "unknown";
    }

    public void setNo(int i) {
        this.no = i;
    }

    public void setTitle(String title) {
        this.title =  title;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
