package Presentation;

import java.util.Scanner;

import identite.Employe;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e = new Employe();
		e.setNom("TOTO");
		e.setPrenom("TITI");
		e.setId(253654123);
		
		
		System.out.println(e);
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("ecrire nom");
		String sonNom = clavier.next();
		System.out.println("ecrire prénom");
		String sonPrenom = clavier.next();
		System.out.println("ecrire id");
		long sonId = clavier.nextLong();
		Employe e1= new Employe(sonNom, sonPrenom, sonId);
		System.out.println(e1);
		clavier.close();
		
		
		}
	}

