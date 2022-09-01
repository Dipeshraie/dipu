package allinone;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDao pDao=new ProductDao();
		int i;
		char ch;
do {
		System.out.println("....main menu.....");
		System.out.println("1.Add product");
		System.out.println("2.View a product");
		System.out.println("3.View all product");
		System.out.println("4.Update aproduct");
		System.out.println("5.Delete a Product");
		do {
			System.out.println("Choice:");
			ch=sc.next().charAt(0);
		}while(!(Integer.parseInt(ch+"")<6 && Integer.parseInt(ch+"")>0));
		if(ch=='1') {
			Product p=new Product();
			System.out.println("Enter a product details:");
			p=getProductDetails();
			i=pDao.save(p);
			if(i==1) {
				System.out.println("Product added to the database;");
			}
			else {
				System.out.println("task failed");
			}
		}
			else if(ch=='2') {
				System.out.println("Enter the id of the product:");
				long id=sc.nextLong();
				Product p=pDao.getOne(id);
				System.out.println(p);
				
			}
			else if (ch=='3') {
				ArrayList<Product>products=pDao.getAll();
				for(Product stp : products) {
					System.out.println(stp);
				}
				System.out.println("End of the task");
				System.out.println();
				
			}
			else if(ch=='4') {
				System.out.println("Enter the id of the product:");
				long id=sc.nextLong();
				Product p=pDao.getOne(id);
				System.out.println(p);
				System.out.println("Enter the updated details:");
				p=getProductDetails();
				p.setId(id);
				i=pDao.update(p);
				if(i==1) {
					System.out.println("product details Updated");
				}
				else {
					System.out.println("Task failed");
				}
				
				
				
			}
			else if(ch=='5') {
				System.out.println("Enter the id of the product:");
				long id=sc.nextLong();
				Product p=pDao.getOne(id);
				System.out.println(p);
				do {
					System.out.println(" confirm or dlt(y/n)?");
					ch=sc.next().charAt(0);
				}while(!(ch=='y'||ch=='n'));
				if(ch=='y') {
					i=pDao.delete(id);
					if(i==1) {
						System.out.println("deleted successfully");
						
					}
					else {
						System.out.println("task failed");
					}
					
				}
				
			}
			
		do {
			System.out.println("Do you want to continue y/n?");
			ch=sc.next().charAt(0);
		}while(!(ch=='y'||ch=='n'));
}while(ch=='y');
	}

	private static Product getProductDetails() {
		Product p=new Product();
		System.out.println("Name:");
		p.setName(sc.next());
		System.out.println("Manufacturer:");
		p.setManufacturer(sc.next());
		System.out.println("Description:");
		p.setDescription(sc.next());
		System.out.println("Price:");
		p.setPrice(sc.nextFloat());
		System.out.println("Is available:");
		p.setInStock(sc.next().equalsIgnoreCase("yes")?true:false);
		return p;
	}

}
