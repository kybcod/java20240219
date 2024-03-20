package ch15.lecture.p2set;

import ch08.sec10.exam01.C;

import java.util.Objects;
import java.util.TreeSet;

public class C06Comparator {
    public static void main(String[] args) {
//        var set = new TreeSet<C06Book>((a, b) -> a.getPrice() - b.getPrice());
        var set = new TreeSet<C06Book>((a, b) -> a.getTitle().compareTo(b.getTitle()));
        set.add(new C06Book("이것이 자바다", 30000));
        set.add(new C06Book("모두의 git", 25000));
        set.add(new C06Book("react", 35000));

        System.out.println(set);
    }
}

class C06Book {
    private String title;
    private Integer price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof C06Book c0Book)) return false;
        return Objects.equals(getTitle(), c0Book.getTitle()) && Objects.equals(getPrice(), c0Book.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice());
    }

    @Override
    public String toString() {
        return "C0Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public C06Book(String title, Integer price) {
        this.title = title;
        this.price = price;
    }
}