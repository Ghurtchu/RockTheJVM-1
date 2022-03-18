package playground;

public class JavaPlayground {

    public static void main(String[] args) {

        Person gela = new Person("Gela");
        printData(gela);

        printData(gela);

        System.out.println("Hello, World!");
        System.out.println(Person.EYE_COUNT);
    }

    private static void printData(Long i) {
        System.out.println(i);
        i += 1;
        System.out.println(i);
    }

    private static void printData(Person p) {
        System.out.println(p.name);
        p.setName("Vaxo");
    }

    private static class Person {
        // class level functionality, not instance level
        public static final int EYE_COUNT = 2;

        String name;

        public Person(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}


