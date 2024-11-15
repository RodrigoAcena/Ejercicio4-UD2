package area;

import java.util.*;

public class Area {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un radio: ");
		double radio = entrada.nextDouble();
		entrada.nextLine();
		
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println(area);
		entrada.close();

	}

}
