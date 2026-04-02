public class HelloApp_UC5 {

    public static void main(String[] args) {

        // If no arguments → print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // If arguments are present → build a comma-separated list
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}