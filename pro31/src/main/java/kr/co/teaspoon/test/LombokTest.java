package kr.co.teaspoon.test;

import kr.co.teaspoon.dto.Sample;

public class LombokTest {

    public static void main(String[] args) {
        Sample dto = new Sample();
        dto.setNo(1);
        dto.setName("사이다");
        System.out.println(dto.toString());

    }
}
