package es.studium.rellenartabla2;

import java.util.Scanner;

public class rellenartabla2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int tabla2[]=new int[4];
		for (int i=0;i<=3;i++)
		{
			System.out.println("Indicar el valor de la tabla en la posici?n "+i);
			tabla2[i] = teclado.nextInt();
		}
		for (int i=0;i<=3;i++)
		{
			System.out.println(tabla2[i]);
		}
		teclado.close();           
	}
}
