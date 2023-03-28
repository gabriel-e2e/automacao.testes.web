package steps;


import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import browsers.Executa;
import metodos.Metodos;

public class BuscarCep {
	
	Metodos metodo = new Metodos();
	
	By cookie = By.id("btnCookie");
	By buscarCep = By.id("relaxation");
	By btnBuscarCep = By.xpath("//div[@class='card card-mais-acessados ordem'][2]//button[@class='bt-link-ic']");
	
	
	@Before
	public void iniciarTeste() {
		
		Executa.iniciarTeste();
		metodo.clicar(cookie, "cookie", "");
		
	}
	@Test
	public void buscarCep() {
		metodo.scroll(0, 350);
		metodo.escrever(buscarCep, "06415000", "buscar cep");
		metodo.clicar(btnBuscarCep, "lupa para buscar cep", "");
		metodo.trocarAba();
		metodo.evidencia("Busca Cep");
		
	}
	
	
	
	
	
		
	

}
