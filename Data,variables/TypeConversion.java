public class TypeConversion {
    public static void main(String[] args) {
        float marks =  75; // implicit conversion (int is smaller than float in terms of storage thus allowed)
        float days = 23L;
        //  float men = 32d; one cannot implicitly store double value in float for that explicit conversion is used;

        int age = (int) 75.0;
        float women = (float) 32.0;
        int children = (int) 45L;

        System.out.println(marks);
        System.out.println(days);
        System.out.println(age);
        System.out.println(women);
        System.out.println(children);

    }
}
