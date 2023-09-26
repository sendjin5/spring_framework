package kr.ed.haebeop.test.proxy;

public class ProxyClientTest {
    public static void main(String[] args) {
        BookService bookService = new BookServiceProxy(new BookServiceImpl());
        Book book = new Book();
        book.setTitle("자바프로그래밍이오");
        bookService.rent(book);;
    }
}
/*
프록시(Proxy) = 대리인

-컴퓨터 프로그래밍에서 자바의 디자인 패턴으로 다른 무언가와 이어지는 인터페이스 역할을 하는 클래스
- 어떤 객체에 대한 접근을 제어하는 용도로 대리인이나 대변인에 해당하는 객체를 제공하는 패턴

프록시는 부가 기능도 수행하며 핵심 기능인 책을 빌리는 기능도 수행

*/

