package inheritance.quiz;


//  아래 그림은 펜과 볼펜,만년필 클래스의 상속관계를 표현한 것입니다.
//  다음과 같이 클래스를 구현하고, 객체를 생성하세요.
public class Quiz3 {
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen(2,100,"파랑색");
        System.out.println(ballpen);

        System.out.println();

        Ftpan ftpan = new Ftpan(3,80,"몽블랑");
        System.out.println(ftpan);
    }
}

class Pen{
    int bold;
    int amount;

    public Pen(int bold, int amount) {
        this.bold = bold;
        this.amount = amount;


    }

    public String toString(){
        return this.bold + "\n" + this.amount + "\n";
    }
}

class Ballpen extends Pen{
    String color;

    public Ballpen(int bold, int amount, String color) {
        super(bold, amount);
        this.color = color;
    }

    public String toString(){
        return "볼펜"+"\n"+super.toString()+color;
    }
}

class Ftpan extends Pen{
    String brand;

    public Ftpan(int bold, int amount, String brand) {
        super(bold, amount);
        this.brand = brand;
    }

    public String toString(){
        return "만년필"+"\n"+super.toString()+brand;
    }
}


