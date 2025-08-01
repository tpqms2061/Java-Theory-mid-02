package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값 기반으로 생성

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashcode() = " + obj1.hashCode());
        System.out.println("obj2.hashcode() = " + obj2.hashCode());
        System.out.println("obj2 = " + obj2); //16진수로 바꾸기 때문에 문자로 나온것

        obj1.toString();
        //각클래스마다 hashcode를 이미 오버라이딩 해두었다.
        Integer i =10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() =" + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        //hashcode 는 마이너스 값이  들어올수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까 ? 인스턴스는 다르지만 , equlas는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashcode를 오버라이딩 하지 않은 경우와 한경우를 비교
        //equals, hashcode를 오버라이딩 하지 않은 경우와 한경우를 비교
        System.out.println("(member1 ==member2) = " + (member1 == member2));
        System.out.println("(member1 equlas member2) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

    }
}
