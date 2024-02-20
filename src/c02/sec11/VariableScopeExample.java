package c02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10; //v2는 해당 if문 블록 내부에서만 사용 가능
        }
//        int v3 = v1 + v2 + 5; //특정 블록 안을 벗어나서 v2는 사용 불가
    }
}
