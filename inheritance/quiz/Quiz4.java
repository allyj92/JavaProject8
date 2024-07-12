package inheritance.quiz;

public class Quiz4 {
    public static void main(String[] args) {
        Monster monster = new Monster(10,100);
        System.out.println(monster.toString());
        monster.attack(10);
        System.out.println(monster.toString());

        System.out.println();

        Slime slime = new Slime(30,200,"마비");
        System.out.println(slime.toString());
        slime.attack(30,100,"마비");
        System.out.println(slime.toString());
        slime.attack(30,100,"마비");
        System.out.println(slime.toString());


    }
}

class Monster{
    private int power;
    private int health;

    public Monster(int power, int health) {
        this.power = power;
        this.health = health;
    }

    public void attack(int power){
        System.out.println("몬스터가 "+power+"만큼 공격했다!");
        decreaseHealth();
    }

    public String toString(){
        return "몬스터의 공격력은 " + power+"이고 " +"체력은 " + health+"이다.";
    }

    public void decreaseHealth(){
        this.health-=power;
    }
        //
    }


class Slime extends Monster{
    private String skill;

    public Slime(int power,int health,String skill) {
        super(power,health);
        this.skill = skill;
    }


    public void attack(int power,int health,String skill){
        System.out.println("슬라임이 " + skill + "를 시전했다!");
        super.decreaseHealth();


    }

    public String toString(){
        return super.toString();
    }




}

