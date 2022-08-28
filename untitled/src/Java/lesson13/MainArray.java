package Java.lesson13;

public class MainArray {

    public static void main(String[] args) {

        CustomList <Integer> customList = new CustomList<>();
        customList.add(10);
        customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        customList.add(6);
        customList.add(7);
        customList.add(8);
        customList.add(9);
        customList.add(11);
        customList.add(12);
        customList.add(13);
        System.out.println(customList);
        System.out.println(customList.contains(7));
        customList.remove(10);
        System.out.println(customList);
        System.out.println(customList.get(10));
        customList.clean();
        System.out.println(customList);
    }
}
