public class PoisonMatango extends Matango {
    int poisonNum = 5;

    public void attack(Hero h) {
        super.attack(h);
        if(this.poisonNum > 0) {
            System.out.println(this.suffix + " poison attack");
            int damage = h.hp/5;
            h.hp -= damage;
            System.out.println(damage + " damage");
            poisonNum -= 1;
        }
    }

    public PoisonMatango(char suffix) {
        super(suffix);
    }
}