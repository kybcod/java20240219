package ch12.lecture.p3regex;

import ch07.sec10.exam02.Animal;
import ch08.sec10.exam01.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class C03PredefinedClass {
    public static void main(String[] args) {
        // [0-9] : \d
        // whitespace : \s
        // word character [a-zA-Z0-9_] : \w
        // 모든 문자 : .

        String p1 = "\\d";
        System.out.println("0".matches(p1)); //t
        System.out.println("5".matches(p1)); //t
        System.out.println("a".matches(p1)); //f
        System.out.println("012".matches(p1)); //f
        System.out.println();

        System.out.println(" ".matches("\\s")); //t
        System.out.println("\t".matches("\\s")); //t
        System.out.println("\n".matches("\\s")); //t
        System.out.println();

        //연습
        String str = "손 흥민";
        String s = str.replaceAll("\\s", "");
        System.out.println(s); //손흥민

        //word character
        System.out.println("s".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("W".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println(" ".matches("\\w")); //f
        System.out.println("$".matches("\\w")); //f
        System.out.println();

        // 모든 문자 : .
        System.out.println("a".matches("."));
        System.out.println(" ".matches("."));
        System.out.println("$".matches("."));
        System.out.println("".matches(".")); //f 빈문자는 안됨


    }
}




