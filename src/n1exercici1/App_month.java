package n1exercici1;
import java.util.*;

public class App_month {

	public static void main(String[] args) {
		
		
		ArrayList<Month> monthsList = new ArrayList<Month>();
		
		monthsList.add(new Month("January"));
		monthsList.add(new Month("February"));
		monthsList.add(new Month("March"));
		monthsList.add(new Month("April"));
		monthsList.add(new Month("May"));
		monthsList.add(new Month("June"));
		monthsList.add(new Month("July"));
		monthsList.add(new Month("September"));
		monthsList.add(new Month("October"));
		monthsList.add(new Month("November"));
		monthsList.add(new Month("November"));//duplicado
		monthsList.add(new Month("December"));
		
		
		System.out.println("meses con dupicado y sin el mes de Agosto");
		for(Month m: monthsList) {
			
			System.out.println(m.getName());
		}
		
		// position 8(index 7)
		monthsList.add(7,new Month("August"));
		
	
		System.out.println("\nVerificando que Agosto esta en su lugar");
		for(Month m: monthsList) {
			System.out.println(m.getName());
		}
	
	
	
		Set<Month> monthSet = new HashSet<>(monthsList);
		System.out.println("\nHashSet de meses (sin duplicados):");
		
		for(Month m:monthSet) {
			
			System.out.println(m.getName());
		}
		
		// agregrar un duplicado en mi hashSet
			System.out.print("\nAgregamos un mes repetido a un hashSet... ");
		
			Month septemberDuplicado = new Month("September");
				
			if (monthSet.add(septemberDuplicado)) {
					
				System.out.println("Mes duplicado agregado al set");
					
			}else {
				System.out.println("no se permiten duplicados");
			}
		
	
		
		System.out.println("\n__Iterate with Iterator__");
		
		Iterator<Month>my_iterator = monthSet.iterator();
		
		while(my_iterator.hasNext()) {
			Month month = my_iterator.next();
			System.out.println(month.getName());
			
			
			
		}
		
	}

}
