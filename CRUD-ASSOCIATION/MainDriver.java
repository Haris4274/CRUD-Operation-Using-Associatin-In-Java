import java.util.Scanner;
class MainDriver {
	private static Scanner SCANNER  = new Scanner(System.in);
	private static boolean DATA = true;
	private static Student STUDENT;
	private static Project PROJECT;
	public static void main(String[] args) {
		do {
			System.out.println("Select Your Choice!");
			System.out.println("-------------------");
			System.out.println("1.Create The Student!");
			System.out.println("2.Read The Student!");
			System.out.println("3.Update The Student!");
			System.out.println("4.Delete The Student!");
			System.out.println("5.Create The Project!");
			System.out.println("6.Read The Project!");
			System.out.println("7.Update The Project!");
			System.out.println("8.Delete The Project!");
			System.out.println("9.Exit!");
			int choice = SCANNER.nextInt();
			switch(choice) {
				case 1 : {
					System.out.println("Enter the Student Id");
					int id = SCANNER.nextInt();
					System.out.println("Enter the Student Name");
					String name = SCANNER.next();
					System.out.println("Enter the Student Mail Id");
					String mailId = SCANNER.next();
					System.out.println("Enter the Student Contact Number");
					long contactNumber = SCANNER.nextLong();
					STUDENT = new Student(id,name,mailId,contactNumber);
					if(STUDENT.getId()!=0&&STUDENT.getName()!=null&&STUDENT.getMailId()!=null&&STUDENT.getContactNumber()!=0l) {
						System.out.println("Student Create Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Already Exist!");
					}
				}
				break;
				case 2 : {
					if(STUDENT.getId()!=0&&STUDENT.getName()!=null&&STUDENT.getMailId()!=null&&STUDENT.getContactNumber()!=0l) {
						System.out.println("Student Details");
						System.out.println("---------------");
						System.out.println("Student Id : "+STUDENT.getId());
						System.out.println("Student Name : "+STUDENT.getName());
						System.out.println("Student Mail Id : "+STUDENT.getMailId());
						System.out.println("Student Contact Number : "+STUDENT.getContactNumber());
						System.out.println("Student Read Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Doesn't Exist!");
					}
				}
				break;
				case 3 : {
					System.out.println("Enter the New Student Id");
					int id = SCANNER.nextInt();
					System.out.println("Enter the New Student Name");
					String name = SCANNER.next();
					System.out.println("Enter the New Student Mail Id");
					String mailId = SCANNER.next();
					System.out.println("Enter the New Student Contact Number");
					long contactNumber = SCANNER.nextLong();
					if(STUDENT.getId()!=0&&STUDENT.getName()!=null&&STUDENT.getMailId()!=null&&STUDENT.getContactNumber()!=0l) {
						STUDENT.setId(id);
						STUDENT.setName(name);
						STUDENT.setMailId(mailId);
						STUDENT.setContactNumber(contactNumber);
						System.out.println("Student Update Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Doesn't Exist!");
					}
				}
				break;
				case 4 : {
					System.out.println("Enter the New Student Id");
					int id = SCANNER.nextInt();
					if(STUDENT.getId()==id) {
						STUDENT = null;
						System.out.println("Student Delete Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Doesn't Exist!");
					}
				}
				break;
				case 5 : {
					System.out.println("Enter the Project Id");
					int id = SCANNER.nextInt();
					System.out.println("Enter the Project Name");
					String name = SCANNER.next();
					PROJECT = new Project(id,name);
					STUDENT.createTheProject(PROJECT);
				}
				break;
				case 6 : {
					STUDENT.readTheProject();
				}
				break;
				case 7 : {
					System.out.println("Enter the New Project Id");
					int id = SCANNER.nextInt();
					System.out.println("Enter the New Project Name");
					String name = SCANNER.next();
					STUDENT.updateTheProject(id,name);
				}
				break;
				case 8 : {
					System.out.println("Enter the Current Project Id");
					int id = SCANNER.nextInt();
					STUDENT.deleteTheProject(id);
				}
				break;
				case 9 : {
					DATA = false;
					System.out.println("Thank You!Visit Again!");
				}
				break;
				default : {
					System.out.println("Invalid Choice!Try Again!");
				}
				break;
			}
		}while(DATA);
	}
}