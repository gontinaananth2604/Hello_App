public class HelloApp_UC6{
        public static void main(String[] args) {

            // If no arguments → default message
            if (args.length == 0) {
                System.out.println("Hello, World!");
            } else {
                StringBuilder nameBuilder = new StringBuilder();

                // Enhanced for loop
                for (String name : args) {
                    nameBuilder.append(name).append(", ");
                }

                // Remove trailing ", "
                String result = nameBuilder.substring(0, nameBuilder.length() - 2);

                // Print final output
                System.out.println("Hello, " + result + "!");
            }
        }
    }