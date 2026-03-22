package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp_UC3 {
    public static void main(String[] args) {

        // Check if command line argument exists
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        }
        else {
            System.out.println("Hello World");
        }
    }
}

