package application;

import java.util.Locale;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
	}

}
