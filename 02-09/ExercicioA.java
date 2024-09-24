package exercicios0209;
public class ExercicioA {
	public static void main(String[] args) {
		
		double jo = 1.34, pe = 1.45;
		int i = 0;
		
	
			while(jo<pe) {
		
		jo = jo + 0.025;
		pe = pe + 0.02;
		
		i++;
			}
			System.out.println("Demorará " +i+ " anos para João ser mais alto que Pedro.");

	}

}
