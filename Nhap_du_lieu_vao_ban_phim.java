package lesson_one;
 import java.util.Scanner;
public class Nhap_du_lieu_vao_ban_phim {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	   System.out.println("nhap vao mot so nguyen ");
	  int a = scanner.nextInt();// doc vao mot so nguyen vd 123
	  System.out.println("nhap vao mot so float ");
	   float floatValue =scanner.nextFloat();// doc vao mot so thuc vd 12.56
	    System.out.println("nhap vao mot so thuc  ");
	    double doubleValue = scanner.nextDouble();
	    
	    System.out.println(a + "-" + floatValue  + "-" + doubleValue);
	    
	    
	    System.out.println("nhap vao mot ki tu: "
	    		+ " ");
	    char c = scanner.next().charAt(0);// doc vao mot ki tu
	    System.out.println("ban vua nhap: "+ c);
	    
	    System.out.println("nhap vao mot tu: ");
	    String work = scanner.next();// doc vao mot tu 
	    System.out.println("ban vua nhap:"+ work);
	    scanner. nextLine();// cho chu ko bi tran 
	    
	    System.out.println("nhap vao mot dong: ");
	    String Line = scanner.nextLine();// nhap vao mot dong
	    System.out.println("ban vua nhap: " + Line );
	    
	    System.out.println("nhap vao mot gia tri true/false: ");
	    boolean booleanValue =scanner.nextBoolean();// nhap vao mot kieu dung hoac sai 
	    System.out.println("ban vua nhap:" + booleanValue);

	}

}
