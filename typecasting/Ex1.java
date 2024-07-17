package typecasting;
/*
 * 자식클래스가 생성되는 과정 확인하기
 * */
public class Ex1 {
}

class Customer {
    String customerName;
    String customerGrade;
    double bonusPoint;
    double bonusRatio;

    public Customer() {
        this.customerGrade ="SILVER";
        this.bonusPoint = 0.01;
        this.bonusRatio = bonusRatio;
    }

    public void calcPrice(int price){
        bonusPoint+= price*bonusRatio;
        System.out.println(customerName+" 님이 " + price + "원을 결제했습니다.");
    }


    public void showInfo(){
        System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "입니다.");
    }


}

class VIPCustomer extends Customer{
    double saleRatio;

    public  VIPCustomer(){
        super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPcustomer() 생성자 호출"); // 생성자 호출시 문장 출력하기 (추가)

    }
}
