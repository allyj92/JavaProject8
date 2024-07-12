package inheritance.quiz;

//  베이직티비(BasicTV)을 정의하는 클래스를 만드세요.
//  속성: 전원상태, 채널, 볼륨
//
//  베이직티비 클래스를 상속받는 스마트티비(SmartTV) 클래스를 만드세요.
//  속성: 아이피
//
//  베이직티비 인스턴스를 생성하세요. (전원 상태:on, 채널:7, 볼륨:20)
//  스마트티비 인스턴스를 생성하세요. (전원 상태:on, 채널:11, 볼륨:30, 아이피:192.168.0.111)
//  모든 인스턴스의 정보를 출력하세요

public class QuIz2 {
    public static void main(String[] args) {
        BasicTv basicTv = new BasicTv();
        basicTv.powerStatus = "on";
        basicTv.chanel = 7;
        basicTv.volume = 20;
        System.out.println(basicTv.toString());

        SmartTv smartTv = new SmartTv();
        smartTv.powerStatus = "on";
        smartTv.chanel =    11;
        smartTv.volume = 30;
        smartTv.ip = "192.168.0.111";
        System.out.println(smartTv.toString());
    }
}

class BasicTv {
    String powerStatus;
    int chanel;
    int volume;

    @Override
    public String toString() {
        return "BasicTv{" +
                "전원 상태='" + powerStatus + '\'' +
                ", 채널=" + chanel +
                ", 볼륨=" + volume +
                '}';
    }
}

class SmartTv extends BasicTv{
    String ip;

    @Override
    public String toString() {
        return "SmartTv{" +
                "아이피='" + ip + '\'' +
                ", 전원 상태='" + powerStatus + '\'' +
                ", 채널=" + chanel +
                ", 볼륨=" + volume +
                '}';
    }
}
