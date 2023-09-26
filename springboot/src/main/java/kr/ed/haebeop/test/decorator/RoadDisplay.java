package kr.ed.haebeop.test.decorator;
//구현체
public class RoadDisplay extends Display {
    @Override
    public void draw() {
        System.out.println("기본도로 표시");
    }
}
