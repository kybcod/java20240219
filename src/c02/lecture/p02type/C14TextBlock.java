package c02.lecture.p02type;

public class C14TextBlock {
    public static void main(String[] args) {
        /*
        <html>
            <head>
                <title> 웹페이지 </title>
            </head>
            <body>
                <h1>페이지 제목</h1>
                <p> 아럼ㅈ다ㅓㅈㅁ랴ㅐㅓ </p>
             </body>
          </html>
        */

        // text block : """묶음, 작성한 내용 그대로 출력,
        //newline, 따옴표 등을 탈출문자 없이 사용 가능
        //가장 왼쪽에 있는 문자 기준으로 들여쓰기 결정
        String html2 = """
                <html>
                    <head>
                        <title> 웹페이지 </title>
                    </head>
                    <body>
                        <h1>페이지 제목</h1>
                        <p> 텍스트 블럭은 작성한 내용 그대로 출력된다. </p>
                     </body>
                </html>
                """;
        System.out.println(html2);
    }
}
