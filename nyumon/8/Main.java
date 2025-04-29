public class Main {
    public static void main(String[] args) {
        Cleric c = new Cleric();
        c.setHp(30);
        c.setMp(7);

        c.prey(2);
        c.selfAid();
    }
}
