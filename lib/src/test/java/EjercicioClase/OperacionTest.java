package EjercicioClase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class OperacionTest {
	//Operaciones operaciones = new Operaciones();
	Operaciones operaciones;
	
	@Before
	public void setUp() {
		operaciones = new Operaciones();
	}
		
	// Operaciones Matematicas
	@Test
	public void recibeCincoyTresyObtengoOcho() {
	   // Arrange
		int a = 5;
		int b = 3;
		
		// Act 		
		int resultado = operaciones.suma(a, b);
		
		// Assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void recibeCuatroyTresyObtengoSiete() {
	   // Arrange
		int a = 4;
		int b = 3;
			
		// Act		
		int resultado = operaciones.suma(a, b);
		
		// Assert
		assertEquals(7, resultado);
	}
	
	@Test
	public void recibeCincoyObtengoSeis() {
	   // Arrange
		int a = 5;
			
		// Act 
		int resultado = operaciones.agregarUno(a);
		
		// Assert
		assertEquals(6, resultado);
	}
	
	@Test
	public void recibeCuatroyObtengoCinco() {
	   // Arrange
		int a = 4;
			
		// Act 
		int resultado = operaciones.agregarUno(a);
		
		// Assert
		assertEquals(5, resultado);
	}
	
	@Test
	public void recibeCincoyTresyObtengoDos() {
	   // Arrange
		int a = 5;
		int b = 3;
			
		// Act 
		int resultado = operaciones.resta(a, b);
		
		// Assert
		assertEquals(2, resultado);
	}

	@Test
	public void recibeCuatroyOchoyObtengoCuatro() {
	   // Arrange
		int a = 4;
		int b = 8;
			
		// Act 
		int resultado = operaciones.resta(a, b);
		
		// Assert
		assertEquals(4, resultado);
	}
	
	@Test
	public void recibeDosyCincoyObtengoDiez() {
	   // Arrange
		int a = 2;
		int b = 5;
			
		// Act 
		int resultado = operaciones.multiplica(a, b);
		
		// Assert
		assertEquals(10, resultado);
	}
	
	@Test
	public void recibeSieteyTresyObtengoVeintiuno() {
	   // Arrange
		int a = 7;
		int b = 3;
			
		// Act 
		int resultado = operaciones.multiplica(a, b);
		
		// Assert
		assertEquals(21, resultado);
	}
	
	@Test
	public void ingresa2y5yObtengo4(){
	   // Arrange
		int a = 2;
		int b = 2;
			
		// Act 
		int resultado = operaciones.multiplica(a, b);
		
		// Assert
		assertEquals(4, resultado);
	}
	
	@Test
	public void recibeSeisyDosyObtengoTres() {
	   // Arrange
		int a = 6;
		int b = 2;
			
		// Act 
		int resultado = operaciones.divide(a, b);
		
		// Assert
		assertEquals(3, resultado);
	}
	
	@Test
	public void recibeDiezyCincoyObtengoDos() {
	   // Arrange
		int a = 10;
		int b = 5;
			
		// Act 
		int resultado = operaciones.divide(a, b);
		
		// Assert
		assertEquals(2, resultado);
	}
	
	@Test
	public void recibeDosyDosyObtengoUno() {
	   // Arrange
		int a = 2;
		int b = 2;
			
		// Act 
		int resultado = operaciones.divide(a, b);
		
		// Assert
		assertEquals(1, resultado);
	}
	
	@Test
	public void recibeholaYObtengohola(){
		// Arrange
		String palabraA = "hola";
		
		// Act 
		String resultado = operaciones.palabra(palabraA);
				
		// Assert
		assertEquals("hola", resultado);
	}
	
	@Test
	public void recibeBancolombiaYObtengoBancolombia(){
		// Arrange
		String palabraA = "Bancolombia";
		
		// Act 
		String resultado = operaciones.palabra(palabraA);
				
		// Assert
		assertEquals("Bancolombia", resultado);
	}
	
	@Test
	public void recibefUnCiOnAlYObtengofUnCiOnAl(){
		// Arrange
		String palabraA = "fUnCiOnAl";
		
		// Act 
		String resultado = operaciones.palabra(palabraA);
				
		// Assert
		assertEquals("fUnCiOnAl", resultado);
	}
	
	@Test
	public void recibeholayObtengoCuatro() {
	   // Arrange
		String palabraA = "hola";
			
		// Act 
		int resultado = operaciones.conteoLetras(palabraA);
		
		// Assert
		assertEquals(4, resultado);
	}
	
	@Test
	public void recibeBancolombiayObtengoOnce() {
	   // Arrange
		String palabraA = "Bancolombia";
			
		// Act 
		int resultado = operaciones.conteoLetras(palabraA);
		
		// Assert
		assertEquals(11, resultado);
	}
		
	@Test
	public void recibefUnCiOnAlyObtengoCuatro() {
	   // Arrange
		String palabraA = "fUnCiOnAl";
			
		// Act 
		int resultado = operaciones.conteoLetras(palabraA);
		
		// Assert
		assertEquals(9, resultado);
	}
	
	
	// Operaciones Logicas
	@Test
	public void reciboCincoyObtengoTrue() {
		// Arrange
		int a = 5;
		
		// Act
		Boolean resultado = operaciones.logicoParImpar(a);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void reciboCuatroyObtengoFalse() {
		// Arrange
		int a = 4;
		
		// Act
		Boolean resultado = operaciones.logicoParImpar(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void reciboTresyObtengoFalse() {
		// Arrange
		int a = 3;
		
		// Act
		Boolean resultado = operaciones.logicoParImpar(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void reciboDosyObtengoFalse() {
		// Arrange
		int a = 2 ;
		
		// Act
		Boolean resultado = operaciones.logicoParImpar(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void reciboCincoyObtengoTrueGanandoPerdiendo() {
		// Arrange
		int a = 5;
		
		// Act
		Boolean resultado = operaciones.partido(a);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void recibomenosTresyObtengoFalseGanandoPerdiendo() {
		// Arrange
		int a = -3;
		
		// Act
		Boolean resultado = operaciones.partido(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void reciboCeroyObtengoFalseGanandoPerdiendo() {
		// Arrange
		int a = 0;
		
		// Act
		Boolean resultado = operaciones.partido(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void recibomenosDosyObtengoTrue() {
		// Arrange
		int a = -5;
		
		// Act
		Boolean resultado = operaciones.partido(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void reciboDosyObtengoTrueDosenDos() {
		// Arrange
		int a = 2;
		
		// Act
		Boolean resultado = operaciones.par(a);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void reciboTresyObtengoFalseDosenDos() {
		// Arrange
		int a = 3;
		
		// Act
		Boolean resultado = operaciones.par(a);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void recibCuatroyObtengoTrueDosenDos() {
		// Arrange
		int a = 4;
		
		// Act
		Boolean resultado = operaciones.par(a);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void recibCincoyObtengoFalseDosenDos() {
		// Arrange
		int a = 5;
		
		// Act
		Boolean resultado = operaciones.par(a);
		
		// Assert
		assertFalse(resultado);
	}

	
	// Piensa Positivo
	@Test
	public void recibeDosyObtengoDos() {
		// Arrange
		int a = 2;
		
		// Act
		int resultado = operaciones.positivo(a);
		
		// Assert
		assertEquals(2, resultado);
	}
	
	@Test
	public void recibemenosCuatroyObtengoCuatro() {
		// Arrange
		int a = -4;
		
		// Act
		int resultado = operaciones.positivo(a);
		
		// Assert
		assertEquals(4, resultado);
	}
	
	@Test
	public void recibemenosSeisyObtengoSeis() {
		// Arrange
		int a = -6;
		
		// Act
		int resultado = operaciones.positivo(a);
		
		// Assert
		assertEquals(6, resultado);
	}
	
	@Test
	public void recibeSieteyObtengoSiete() {
		// Arrange
		int a = 7;
		
		// Act
		int resultado = operaciones.positivo(a);
		
		// Assert
		assertEquals(7, resultado);
	}

 //Calculadora logica
	//AND
	@Test
	public void recibeTrueyTrueyObtengoTrue() {
		// Arrange
		boolean a = true;
		boolean b = true;
		
		// Act
		boolean resultado = operaciones.logicoAND(a, b);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void recibeTrueyFalseyObtengoFalse() {
		// Arrange
		boolean a = true;
		boolean b = false;
		
		// Act
		boolean resultado = operaciones.logicoAND(a, b);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void recibeFalseyTrueyObtengoFalse() {
		// Arrange
		boolean a = false;
		boolean b = true;
		
		// Act
		boolean resultado = operaciones.logicoAND(a, b);
		
		// Assert
		assertFalse(resultado);
	}
	
	@Test
	public void recibeFalseyFalseyObtengoFalse() {
		// Arrange
		boolean a = false;
		boolean b = false;
		
		// Act
		boolean resultado = operaciones.logicoAND(a, b);
		
		// Assert
		assertFalse(resultado);
	}
	
//OR 
	@Test
	public void recibeTrueytrueyObtengoTrue() {
		// Arrange
		boolean a = true;
		boolean b = true;
		
		// Act
		boolean resultado = operaciones.logicoOR(a, b);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void recibeTrueyFalseyObtengoTrue() {
		// Arrange
		boolean a = true;
		boolean b = false;
		
		// Act
		boolean resultado = operaciones.logicoOR(a, b);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void recibeFalseyTrueyObtengoTrue() {
		// Arrange
		boolean a = false;
		boolean b = true;
		
		// Act
		boolean resultado = operaciones.logicoOR(a, b);
		
		// Assert
		assertTrue(resultado);
	}

	@Test
	public void recibeFalseyfalseyObtengoFalse() {
		// Arrange
		boolean a = false;
		boolean b = false;
		
		// Act
		boolean resultado = operaciones.logicoOR(a, b);
		
		// Assert
		assertFalse(resultado);
	}

/* Celebridad por color */
	@Test
	public void reciboRojoyVerdeyObtengoNavidad() {
		// Arrange
		String colorA = "Rojo";
		String colorB = "Verde";
		
		// Act
		String resultado = operaciones.festividad(colorA, colorB);
		// Assert
		assertEquals("Navidad", resultado);
	}
	
	@Test
	public void reciboVerdeyNaranjayObtengoHalloween() {
		// Arrange
		String colorA = "Verde";
		String colorB = "Naranja";
		
		// Act
		String resultado = operaciones.festividad(colorA, colorB);
		
		// Assert
	    assertEquals("Halloween", resultado);
	}
	
	@Test
	public void reciboRojoyNaranjayObtengoPascua() {
		// Arrange
		String colorA = "Rojo";
		String colorB = "Naranja";
		
		// Act
		String resultado = operaciones.festividad(colorA, colorB);
		
		// Assert
		assertEquals("Pascua", resultado);
	}

//Ultimo Integer con resultado Boolean
	@Test
	public void reciboOchoyDieciochoyObtengoTrue() {
		// Arrange
		int a = 8;
		int b = 18;
		
		// Act 
		boolean resultado = operaciones.intBool(a, b);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void reciboTresyCientoTreceyObtengoTrue() {
		// Arrange
		int a = 3;
		int b = 113;
		
		// Act 
		boolean resultado = operaciones.intBool(a, b);
		
		// Assert
		assertTrue(resultado);
	}
	
	@Test
	public void reciboSeisyCientoDieciSieteyObtengoFalse() {
		// Arrange
		int a = 6;
		int b = 117;
		
		// Act 
		boolean resultado = operaciones.intBool(a, b);
		
		// Assert
		assertFalse(resultado);
	}



}
