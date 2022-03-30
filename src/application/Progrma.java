package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Progrma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		List <Funcionario> list = new ArrayList<>();
		
		System.out.println("Entre com a quantidade de funcionarios registrado");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println();
			System.out.println("Funcionairo #"+i);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("id: ");
			int id = sc.nextInt();
			System.out.print("salario: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(nome,id,salario));
		}
		
		System.out.println();
		System.out.println("Entre com o id do funcionario");
		int procurarId = sc.nextInt();
		
	    func = list.stream().filter(x -> x.getId()== procurarId).findFirst().orElse(null);
		
		
		if(func != null)
		{
			System.out.println("Quantos porcentos");
			double porcento = sc.nextDouble();
			func.aumentarSalario(porcento);
		}
		else 
		{
			System.out.println("Esse id não existe");
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		
		for(Funcionario obj : list) {
			System.out.println(obj.tostring());
		}

	    sc.close();

	}
	
//	public static boolean hasId(List<Funcionario> list, int id) {
//		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//		return func != null;

	//}
	
}
