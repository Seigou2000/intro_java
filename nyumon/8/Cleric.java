import java.util.Random;

public class Cleric {
    String name = "Shiho";
    int hp;
    static final int MAX_HP = 50;
    int mp;
    static final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "セルフエイドを唱えた");
        this.mp -= 5;
        this.hp = MAX_HP;
    }

    public int prey(int sec) {
        System.out.println(this.name + "は" + sec + "秒祈った。");

        int recover = new Random().nextInt(3) + sec;

        int recoverActual = Math.min(MAX_MP - this.mp, recover);

        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }
}