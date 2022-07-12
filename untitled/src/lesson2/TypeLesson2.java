package lesson2;

public class TypeLesson2 {

    public static int a = 10;
    public static double b = 1.5;
    public static String value = "calculate";


    public static void main(String[] args) {
        System.out.println(a*b + a/b);
        a++;
        b++;
        double c = a + b;
        System.out.println("Cумма равна " + c);

        String result = sumType(value, a);
        System.out.println(result);
        compare(a, b);
        exclusiveOR(a, b);
    }

    public static String sumType (String value, int a){
        return value + a;
    }

    public static void compare (int a, double b){

        boolean compare = a <= b;
        double d = a%b;

        System.out.println(compare);
        System.out.println("Остаток от деления " + d);
        System.out.println(compare || true);
    }

    public static void exclusiveOR (int a, double b){
        System.out.println((int) b^a);
    }


}

