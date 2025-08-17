package ct.week02;

import java.util.List;
import java.util.Vector;

public class Ex22 {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();
        Board board = new Board();
        board.setNo(1);
        board.setTitle("제목1");
        board.setCn("내용1");
        board.setWriter("작성자1");
        list.add(board);
        board = new Board();

        list.add(new Board(3, "제목3", "내용3", "작성자3"));
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
        }
    }
}
