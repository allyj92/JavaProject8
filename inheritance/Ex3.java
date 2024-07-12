package inheritance;

public class Ex3 {
    public static void main(String[] args) {

    }
}

// 일반회원 클래스
class Customer{
    String customerName; // 회원 이름
    String customerGrade; // 회원 등급
    double bonusPoint; // 보너스 포인트
    double bonusRatio; // 적립률

    public Customer(){
        customerGrade = "SILVER"; // 고정값이니까 초기화
        bonusRatio = 0.01;
    }

    // 보인스 포인트 적립하고, 지불 가격을 계산하는 메소드
    public void calcPrice(int price){
        bonusPoint += (price * bonusRatio);
        System.out.println(customerName+"님이" + price +"원을 결제했습니다.");

    }
    public void showInfo(){
        System.out.println(customerName + " 님의 등급은 " + customerGrade +"이며, 보너스 포인트는 " + bonusPoint + "입니다.");
    }

}

class VIPCustomer extends  Customer{
        double saleRatio;

        public VIPCustomer(){
            super();
            customerGrade = "VIP";
            bonusRatio = 0.05;
            saleRatio = 0.1;
        }
}
