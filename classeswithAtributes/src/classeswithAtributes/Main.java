package classeswithAtributes;

public class Main {

	public static void main(String[] args) {
		
		Product product= new Product();
		
		product.id = 02; 
		System.out.println(product.id);
		
		product.description ="laptop";
		System.out.println(product.description);
		
		product.name="laptop";
		
		product.description="bardak";
		

		
		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
	}

}
