import java.util.Scanner;
import java.util.Random;

class Player {
    private String name;
    private int health;
    private int attackPower;

    public Player(String name, int attackPower){
        this.name = name;
        this.health = 100;
        this.attackPower = attackPower;
    }


    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public void takeDamage(int damage){
        health -= damage;
        if (health < 0){
            health = 0;
        }
    }
    public void attack(Monster monster){
        System.out.println(name +"이가" + monster.getName() + "에게" + attackPower + "의 피해를 주었습니다.");
        monster.takeDamage(attackPower);
    }

}

class Monster {
    private String name;
    private int health;
    private int attackPower;

    public Monster(String name , int attackPower){
        this.name = name;
        this.health = 50;
        this.attackPower = attackPower;
    }


    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public void takeDamage(int damage){
        health -= damage;
        if (health < 0){
            health = 0;
        }
    }
    public void attack(Player player){
        System.out.println(name +"이가" + player.getName() + "에게" + attackPower + "의 피해를 주었습니다.");
        player.takeDamage(attackPower);
    }

}

public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int randomPlayer = random.nextInt(20) + 1;
        int randomMonster = random.nextInt(15) + 1;

        System.out.print("플레이어의 이름을 입력하세요: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName, randomPlayer);

        Monster monster = new Monster("몬스터", randomMonster);

        System.out.println("게임을 시작합니다! " + monster.getName() + "이(가) 나타났습니다.");

        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            System.out.println("\n플레이어 체력: " + player.getHealth());
            System.out.println(monster.getName() + " 체력: " + monster.getHealth());
            System.out.println("1: 공격하기, 2: 도망가기");
            int choice = scanner.nextInt();

            if (choice == 1) {
                player.attack(monster);
                if (monster.getHealth() > 0) {
                    monster.attack(player);
                }
            } else if (choice == 2) {
                System.out.println(player.getName() + "이(가) 도망쳤습니다!");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + "이(가) 패배했습니다...");
        } else if (monster.getHealth() <= 0) {
            System.out.println("축하합니다! " + player.getName() + "이(가) " + monster.getName() + "을(를) 처치했습니다!");
        }

        scanner.close();
    }
}