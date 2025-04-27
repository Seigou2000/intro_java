public class SuperHero extends Hero {

    public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }
    
    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println("SuperHero flew up !");
    }

    public void land() {
        this.flying = false;
        System.out.println("SuperHero landed!");
    }

    public void run() {
        System.out.println(this.name + " pulled out");
    }
}