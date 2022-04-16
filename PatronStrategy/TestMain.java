package PatronStrategy;

public class TestMain {

	public static void main(String[] args) {
		
		int numbers[] = {20, 50, 15, 6, 80};
		
		System.out.println("----------------------------------------");
		System.out.println("Ejemplo de Patron Strategy");
		System.out.println("----------------------------------------");

		SortingContext context = new SortingContext();
		context.setSortingMethod(new InsertionSort());
		context.sortNumbers(numbers);
		
		System.out.println("--------------------------");
		context.setSortingMethod(new SelectionSort());
		context.sortNumbers(numbers);
		
	}
}