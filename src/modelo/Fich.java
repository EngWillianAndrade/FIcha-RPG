package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fich {

	public static void main(String[] args) {
		
		Atributos atributos = new Atributos();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor Força: ");
		atributos.setForca(entrada.nextInt());
		
		System.out.println("Valor Dextreza: ");
		atributos.setDextreza(entrada.nextInt());

		
		System.out.println("Valor Controle: ");
		atributos.setControle(entrada.nextInt()); 
		
		System.out.println("Valor Habilidade: ");
		atributos.setHabilidade(entrada.nextInt()); 
		
		System.out.println("Valor inteligencia: ");
		atributos.setInteligencia(entrada.nextInt()); 
		
		System.out.println("Valor Raciocinio: ");
		atributos.setRaciocinio(entrada.nextInt()); 
		
		System.out.println("Valor Saude: ");
		atributos.setSaude(entrada.nextInt()); 
		
		System.out.println("Valor Sentidos: ");
		atributos.setSentidos(entrada.nextInt()); 
		
		System.out.println("Valor sentimentos: ");
		atributos.setSentidos(entrada.nextInt()); 
		
		System.out.println("Valor Sobrenaturais: ");
		atributos.setSobrenaturais(entrada.nextInt()); 
		
		System.out.println("Valor Sorte: ");
		atributos.setSorte(entrada.nextInt()); 
		
		System.out.println("Valor Vigor: ");
		atributos.setVigor(entrada.nextInt()); 
		
		System.out.println("Valor Vida Total: ");
		atributos.setVidaTotal(entrada.nextInt()); 
		
		System.out.println("Valor Energia Total: ");
		atributos.setEnergiaTotal(entrada.nextInt()); 
		
		entrada.close();
		
		FileWriter arquivo;
		
		try {
			arquivo = new FileWriter("Ficha.txt");
			PrintWriter pw = new PrintWriter(arquivo);
			pw.println("Força = " + atributos.getForça());
			
			arquivo.close();
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(atributos.toString());
		
	}
}
