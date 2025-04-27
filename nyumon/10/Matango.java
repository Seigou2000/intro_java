public class Matango {
    int hp = 50;
    // final int LEVEL = 10;
    char suffix;
    public void run() {
        System.out.println("Matango" + this.suffix + "ran out !");
    }

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        System.out.println("attack of " + this.suffix);
        System.out.println("10 damage");
        h.hp -= 10;
    }
}