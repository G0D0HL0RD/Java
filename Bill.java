import java.util.Scanner;
public class Bill extends Item {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of items: ");
			int num = sc.nextInt();
			Item[] obj = new Item[num];
			for (int i = 0; i < num; i++) {
				obj[i] = new Item();
				System.out.println("Enter details of the item: ");
				obj[i].input();
			}
			int amt = 0;
			System.out.println("******************************************************************");
			System.out.println("Name\t\tQuantity\t\tPrice\t\tTotal Cost");
			for (int i = 0; i < num; i++) {
				obj[i].display();
				amt += obj[i].total_cost;
			}
			System.out.println("Total Amount: " + amt);
		}
		
	}
}