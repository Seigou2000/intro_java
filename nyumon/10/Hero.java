public class Hero {
    String name = "Minato";
    int hp = 100;

    public void attack(Matango m) {
        System.out.println("attack of " + this.name);
        m.hp -= 5;
        System.out.println("5 damage");
    }

    public void run() {
        System.out.println(this.name + " run out !");
    } 
}