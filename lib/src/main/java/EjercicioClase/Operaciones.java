package EjercicioClase;

public class Operaciones {

	public int suma(int a, int b) {
		return a + b;	
	}

	public int agregarUno(int a) {
		return ++a;
	}

	public int resta(int a, int b) {
		return Math.abs(a - b); 
	}

	public int multiplica(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public String palabra(String palabraA) {
		return palabraA;
	}
	
	public int conteoLetras(String palabraA) {
		return palabraA.length();
	}

	public boolean logicoParImpar(int a) {
		if (a != 5) {
			return false;
		}
	
		return true;  
	}

	public Boolean partido(int a) {
		if (a > 0) {
			return true;
		}
		return false;  
	}
	
	public Boolean par(int a) {
		
		if((a % 2) == 0) {
			return true;
		}
		return false;
	}	

	public int positivo(int a) {
		if (a > 0) {
			return a;
		} else {
			return a * -1;}
	}
	
	public boolean logicoAND(boolean a, boolean b) {
		if (a && b) {
			return true;
		} 

		return false;
	}
	
	public boolean logicoOR(boolean a, boolean b) {
      if (a || b) {
	     return true;
      }
      return false;
    }
	
	public String festividad(String colorA, String colorB) {
		if ( colorA == "Verde" && colorB == "Naranja") {
			return "Halloween";
		} else if (colorA == "Rojo" && colorB == "Naranja") {
			return "Pascua";
		}
		return "Navidad";
	}

	public boolean intBool(int a, int b) {
		
		String valorA = String.valueOf(a);
		String valorB = String.valueOf(b);
		
		return valorB.endsWith(valorA);
		/* if ((a % b) == 0) {
			return true;
		}
		return false;*/
	}
	

}

/* Condicionales
 * != diferente
 * < menor que
 * > mayor que
 * == igual
 * % modulo
 * 
 * */

/*
 * ++nombreVariable
 * Este suma un 1 en la misma linea.
 * 
 * nombreVariable++
 * Este suma un 1 en la sigueinte linea.*/

/*
 * PascalCase
 * AnthonyRomero
 * 
 * 
 * camelCase
 * anthonyRomero*/
