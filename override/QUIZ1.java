package override;
/*
 * 부모클래스와 자식클래스를 정의하세요.
 * 부모클래스 참조변수를 선언하고 자식 클래스로 생성한 인스턴스를 대입하세요.
 * 그리고 자식클래스의 정보를 출력하세요.
 * */
public class QUIZ1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.eat();
        cat.sound();
        dog.eat();
        dog.sound();
    }
}

class Animal{
    public void eat(){
        System.out.println("먹는다");
    }
    public void sound(){
        System.out.println("짖는다");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("고양이가 쥐를 먹는다");
    }
    public void sound(){
        System.out.println("고양이는 야옹하고 짖는다");
    }

}

class Dog extends Animal{
    public void eat(){
        System.out.println("강아지가 뼈다귀를 먹는다");
    }
    public void sound(){
        System.out.println("강아지는 멍멍 하고짖는다");
    }
}
