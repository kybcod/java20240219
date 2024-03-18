package ch15.sec02.exam01;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1", "글쓰이1"));
        list.add(new Board("제목2", "내용2", "글쓰이2"));
        list.add(new Board("제목3", "내용3", "글쓰이3"));
        list.add(new Board("제목4", "내용4", "글쓰이4"));
        list.add(new Board("제목5", "내용5", "글쓰이5"));

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());

        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());

        }

        list.forEach(System.out::println);
    }
}
