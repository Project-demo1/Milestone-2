package Hello.milestone_2;

public class Employee {
	   private int id;
		private String name;
		private int purchaseAmount;
		private int age;
		public int getId() {
			return id;
		}
	//Getter and setter
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getpurchaseAmount() {
			return purchaseAmount;
		}

		public void setpurchaseAmount(int purchaseAmount) {
			this.purchaseAmount = purchaseAmount;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		
	 //constructor
		public Employee(int id, String name, int purchaseAmount, int age) {
			super();
			this.id = id;
			this.name = name;
			this.purchaseAmount = purchaseAmount;
			this.age = age;
		}
		
	}


