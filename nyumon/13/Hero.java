public class Hero {
    private int hp = 100;
    private String name = "Minato";

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("name is too short");
        }
        this.name = name;
    }
}