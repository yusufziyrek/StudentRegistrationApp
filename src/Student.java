import java.util.Scanner;

public class Student {

	private String name, id, departmant;
	private int grade;
	public static int presence = 0;

	public Student() {

		studentRegistration();
	}

	private void studentRegistration() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter student's name : ");
		setName(input.nextLine());

		System.out.print("Enter student's id : ");
		setId(input.nextLine());

		System.out.print("Enter student's departmant : ");
		setDepartmant(input.nextLine());

		System.out.print("Enter student's grade : ");
		setGrade(input.nextInt());

		System.out.println(" !! Student created succesfully !!");
		presence++;

	}

	public void showInformation() {

		System.out.println("-------------------------------");
		System.out.println("Student name   : " + getName());
		System.out.println("Student id     : " + getId());
		System.out.println("Student depart : " + getDepartmant());
		System.out.println("Student grade  : " + getGrade());
		System.out.println();

	}

	private String getName() {
		return name;

	}

	private void setName(String name) {

		if (name.length() < 0 || name.length() < 3) {

			throw new IllegalArgumentException("Hatali isimlendirme !!");
		} else {

			this.name = name.toUpperCase();

		}

	}

	private String getId() {
		return id;
	}

	private void setId(String id) {

		if (id.length() != 9) {

			throw new IllegalArgumentException("Id uzunlugu 9 karakter olmali !!");

		} else {

			this.id = id;
		}

	}

	private String getDepartmant() {
		return departmant;
	}

	private void setDepartmant(String departmant) {
		this.departmant = departmant.toUpperCase();
	}

	private int getGrade() {
		return grade;
	}

	private void setGrade(int grade) {

		if (grade <= 0) {

			throw new IllegalArgumentException("Sinif seviyesi 0 dan buyuk olmali !!");

		} else {

			this.grade = grade;
		}
	}

}
