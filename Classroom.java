public class Classroom {

    public static void main(String[] args) {
        Wilder joe = new Wilder("Joe", false);
        Wilder jane = new Wilder("Jane", true);
        Wilder bob = new Wilder("Bob", true);

        System.out.println("1. Wilder : " + joe.whoAmI());
        joe.setAware(false);
        System.out.println("2. Wilder : " + jane.whoAmI());
        jane.setAware(true);
        System.out.println("3. Wilder : " + bob.whoAmI());
        bob.setAware(true);
    }
}
