public class Wizard {
    private int hp = 100;
    private int mp = 100;
    private String name = "Shiho";
    private Wand wand = new Wand();

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println("Hp of " + h.getName() + " " + recovPoint + " recover");
    }
}