package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int n = sc.nextInt();
		Product product = new Product();
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + i + 1);
			System.out.println("Common, used or imported (c/u/i)?");
			char type = sc.next().toLowerCase().charAt(0);
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			if (type == 'c') {
				Product c = new Product(name, price);
				product.addProduct(c);
			} else if (type == 'u') {
				System.out.println("Manafacture date (DD/MM/YYYY):");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product u = new UsedProduct(name, price, date);
				product.addProduct(u);
			} else if (type == 'i') {
				System.out.println("Customs fee:");
				double customs = sc.nextDouble();
				Product ip = new ImportedProduct(name, price, customs);
				product.addProduct(ip);
			}
		}
		System.out.println(product.displayProducts());

		sc.close();
	}

}
