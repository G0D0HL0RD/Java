import java.util.Scanner;
public class Item{
    String item_name;
    int quantity, price, total_cost;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of item: ");
        item_name = sc.next();
        System.out.println("Enter the quantity of each item: ");
        quantity = sc.nextInt();
        System.out.println("Enter the price of the item: ");
        price = sc.nextInt();
        total_cost = quantity*price;
        sc.close();
    }
    void display() {
        System.out.println(item_name +"\t\t"+quantity+"\t\t"+price+"\t\t"+total_cost);
    }
}
