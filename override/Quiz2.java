package override;
/*
 * 커피,아메리카노,카페라떼 클래스를 정의하세요.
 * 커피클래스에서 상속받은 taste() 메소드를 재정의하세요
 * */
public class Quiz2 {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.taste();
        Coffee coffee2 = new Americano();
        coffee2.taste();
        Coffee coffee3 = new Caffelatte();
        coffee3.taste();

    }
}

class Coffee{
    public void taste(){
        System.out.println("커피를 마신다");
    }
}

class Americano extends Coffee{
    public void taste(){
        System.out.println("아메리카노를 마신다");
    }
}

class Caffelatte extends Coffee{
    public void taste(){
        System.out.println("카페라뗴를 마신다");
    }

}
