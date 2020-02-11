package util;

import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordValidator {
 public static boolean passwordValidator(String plainPassword, String hashedPassword) {
	 
	return BCrypt.checkpw("qwerty", PasswordEncoder.passwordEncoder(plainPassword));
 }
 
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the password to b encoded");
	String plainPassword = sc.nextLine();
	String hashedPassword = PasswordEncoder.passwordEncoder(plainPassword);
	System.out.println(hashedPassword);
	System.out.println("enter the password to be matched");
	String password = sc.nextLine();
	if(passwordValidator(password, hashedPassword)) {
		System.out.println("Password Matches");
	} else {
		System.err.println("Invalid Password");
	}
	
	sc.close();
}
 
 
 
 
}





