public class HelloApp_UC7{
        public static void main(String[] args) {

            String greeting;

            // Check if no arguments are provided
            if (args.length == 0) {
                greeting = "Hello, World!";
            } else {
                // Join names with comma and space
                String names = String.join(", ", args);
                greeting = "Hello, " + names + "!";
            }

            // Print the greeting
            System.out.println(greeting);
        }
    }