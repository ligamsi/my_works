public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        for (int i = 0; i < 100; i++) {
            map.put(i, "Value " + i);
        }

        System.out.println(map.size());     // 100
        System.out.println(map.get(50));    // Value 50
        System.out.println(map.get(99));    // Value 99

        map.remove(50);

        System.out.println(map.get(50));    // null
        System.out.println(map.size());     // 99
    }
}
