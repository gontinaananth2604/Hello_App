import java.util.Scanner;

class Banner {
    int id;
    String name;
    String category;

    Banner(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
    void display() {
        System.out.println(id + " " + name + " " + category);
    }
}
public class UC4HelloApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter");
        int n = sc.nextInt();
        sc.nextLine();
        Banner[] banners = new Banner[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String category = sc.nextLine();

            banners[i] = new Banner(id, name, category);
        }

        for (int i = 0; i < n; i++) {
            banners[i].display();
        }

        sc.close();
    }
}