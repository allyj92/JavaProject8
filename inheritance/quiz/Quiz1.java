package inheritance.quiz;
//  동물(Animal)을 정의하는 클래스를 만드세요.
//  속성: 다리
//  동물 클래스를 상속받는 호랑이(Tiger) 클래스를 만드세요.
//  속성: 꼬리
//  동물 클래스를 상속받는 독수리(Eagle) 클래스를 만드세요.
//  속성: 날개
//
//  호랑이 인스턴스를 생성하세요.(다리4개, 꼬리1개)
//  독수리 인스턴스를 생성하세요.(다리2개, 날개2개)
public class Quiz1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Tiger tiger = new Tiger();
        tiger.leg = 4;
        tiger.tail = 1;
        Eager eager = new Eager();
        eager.leg = 2;
        eager.wing = 2;
    }
}

class Animal{
    int leg;


}

class Tiger extends Animal{
    int tail;
}

class Eager extends Animal{
    int wing;
}