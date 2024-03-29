package entities;

public class Product {  //classe produto com nome, pre�o e quantidade em estoque. Metodo setQuantity nao foi criado, porque esta propriedade da classe deve ser editado somente pelo metodo que acrescenta ou apaga item do estoque(seguranca) 
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) { //construtor com parametro, para evitar de instanciar a classe sem valores validos(seguranca)
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return quantity * price;
	}

	public void addProducts(int q) {
		quantity += q;
	}

	public void removeProducts(int q) {
		quantity -= q;
	}

	public String toString() {
		return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f%n%n", totalValueInStock());
	}
}
