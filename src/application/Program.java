package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product a; //declara um produto
		
		System.out.println("Enter the product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		System.out.println();
		
		a = new Product(name, price, quantity); // instancia um produto com os dados retirados do teclado
		System.out.print(a);
		
		System.out.printf("Enter the number of products to be added in stock: ");
		a.addProducts(sc.nextInt()); //utiliza metodo da classe para adcionar produtos no estoque 
		
		System.out.print(a);//ou print(a.toString()) da no mesmo. O java implicitamente chama a implementação do método toString <3)
		
		System.out.printf("Enter the number of products to be removed from stock: ");
		a.removeProducts(sc.nextInt());
		
		System.out.print(a);
		
		sc.close();
	}

}
