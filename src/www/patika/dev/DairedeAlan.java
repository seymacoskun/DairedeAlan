package www.patika.dev;

import java.util.Scanner;

public class DairedeAlan 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		double r = inp.nextDouble();
		System.out.println("Dairenin merkez a��s�n� giriniz: ");
		double aci = inp.nextDouble();
		double alan = ((pi*(r*r))*aci)/360;
		System.out.println("Dairenin alan�: " +alan "d�r.");
	}
}
