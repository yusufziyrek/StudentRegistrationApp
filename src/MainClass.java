import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> list = new ArrayList<Student>();

	public static void main(String[] args) {

		loginPage();
		while (getOption() != -1) {

		}

	}

	public static void loginPage() {

		System.out.println(" --- Welcome my course --- ");
		System.out.println("1- Adding students \n2- Show student information\n3- (-1) for exit");

	}

	public static int getOption() {

		int option;

		do {
			System.out.print("Please enter an option : ");
			option = input.nextInt();
			if (option == -1) {
				System.out.println(" !! Sistemden cikildi !!");
				break;

			}

		} while (option < 1 || option > 2);

		controlOption(option);
		return option;

	}

	public static void showStudents() {

		for (Student student : list) {

			student.showInformation();

		}

	}

	public static void controlOption(int option) {

		switch (option) {
		case 1:

			System.out.println("---------------");
			Student student = new Student();
			addToList(student);
			break;

		case 2:

			if (Student.presence <= 0) {

				System.out.println("!! No students yet !!");

				break;
			}

			// System.out.print("Enter the index of the student whose information you want
			// to see : ");
			showStudents();

			break;

		}

	}

	public static void addToList(Student student) {

		list.add(student);

	}
}
