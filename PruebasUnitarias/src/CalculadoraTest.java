import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	static int numeroDePrueba = 1;
	static Calculadora c;

	@BeforeClass
	public static void antesDeTodo() {

		System.out.println("Iniciando pruebas unitarias de calculadora");
		c = new Calculadora();
	}

	// La funcion se va a ejecutar antes de la prueba
	@Before

	public void antesDeCadaPrueba() {
		System.out.println("Empezando la prueba" + numeroDePrueba);
	}
	
	@Test
	public void testeandoSuma1() {
		System.out.println("Empezando la prueba suma1");
		double resultado = c.sumar(18,50,10,22,-44,15,69);
		assertTrue(resultado == 140);
	}
	
	@Test
	public void testeandoSuma2() {
		System.out.println("Empezando la prueba suma2");
		double resultado = c.sumar(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.0,0.0,0.00000000000);
		assertTrue(resultado == 0);
	}
	@Test
	public void testeandoResta1() {
		System.out.println("Empezando la prueba resta1");
		double resultado = c.restar(200,40,60);
		assertTrue(resultado == 100);
	}
	@Test
	public void testeandoMuliplicacion1() {
		System.out.println("Empezando la prueba multiplicacion1");
		double resultado = c.multiplicacion(1,2,3,4);
		assertTrue(resultado == 24);
	}
	@Test
	public void testeandoMultiplicacion1() {
		System.out.println("Empezando la prueba division1");
		double resultado = c.division(100,10);
		assertTrue(resultado == 10);
	}
	
	@After
	public void despuesDeCadaPrueba() {
		System.out.println("Finalizando la prueba" + numeroDePrueba);
		numeroDePrueba++;
		
		System.out.println("");
	}
	
	@AfterClass
	public static void despuesDeTodo() {
		System.out.println("Finalizando las pruebas unitarias de la calculadora");
	}
}
