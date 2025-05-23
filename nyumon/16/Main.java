import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");

        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(h1);
        heroes.add(h2);

        for (Hero h : heroes) {
            System.out.println(h.getName());
        }

        Map<String, Integer> num = new HashMap<String, Integer>();
        num.put("斎藤", 3);
        num.put("鈴木", 7);

        for (String key : num.keySet()) {
            int value = num.get(key);
            System.out.println(key + "の倒した敵=" + value);
        }
    }
}
