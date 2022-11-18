import java.util.*;

class Tourist implements Comparable<Tourist> {
	String name;
	String state;
	String famous_spot;
	Scanner sc = new Scanner(System.in);

	public int compareTo(Tourist s) {
		return (this.state.compareTo(s.state));
	}

	void input() {
		System.out.print("Enter the name:");
		name = sc.next();
		System.out.print("Enter the state name:");
		state = sc.next();
		System.out.print("Enter the famous spot:");
		famous_spot = sc.next();
	}

	void display() {
		System.out.println("The name of the tourist entered:" + name);
		System.out.println("The name of the state entered:" + state);
		System.out.println("The famous spot entered:" + famous_spot);
	}
}

class Tour {
	public static void main(String[] args){
		try{ ArrayList<Tourist> list= new ArrayList<Tourist>();
			try (Scanner sr = new Scanner(System.in)) {
				System.out.println("enter the number of tourists:");
				int n = sr.nextInt();
				Tourist trs=new Tourist();
				for(int i=0 ; i<n ;i++){
					System.out.println("Enter the details of the tourists:");
					trs.input(); list.add(trs);
				}
				Collections.sort(list);
				System.out.println("***************************");
				System.out.println("The entered details are:");
				for(int i=0;i<n;i++){
					list.get(i).display();
				}
				System.out.println("\n***************************\n");
				System.out.println("Enter the state your want to search:");
				String search = sr.next();
				boolean flag = false;
				Iterator<Tourist> itr = list.iterator();
				while (itr.hasNext()){
					Tourist temp = (Tourist) itr.next();
					if (temp.state.equals(search)) {
						System.out.println(temp.name);
						System.out.println(temp.state);
						System.out.println(temp.famous_spot);
						flag = true;
						break;
					}
				}
				if (flag = false)
					throw new tourexcep("The entered state details are not present in the database!!");
			}
		} catch (tourexcep e) {
			System.out.println(e);
		}
	}
}