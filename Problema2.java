package mate;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		
		
		String l;
		int n=0,i=0,k=0,j=0;
		int comp=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti elementele multimii S: ");
		l=s.nextLine();
		String[] a=l.split(" ");
		System.out.print("Introduceti o permutarea lui S: ");
		l=s.nextLine();
		String[] b=l.split(" ");
		
		
		System.out.print("Permutarea precedenta este: ");
		String aux=" ";
		n=b.length;
		i=n-1;
		while(i>0)
		{
			comp=b[i-1].compareTo(b[i]);
			if(comp>=1)
				break;
			i--;
		}
		if(i==0)
		{
			System.out.println("Nu avem permutare precedenta");
			
		}
		else {
		j=n-1;
		while(j>0 && j>=i)
		{
			comp=b[j].compareTo(b[i-1]);
			if(comp<=-1)
				break;
			j--;
		}
			aux=b[j];
			b[j]=b[i-1];
			b[i-1]=aux;
			k=i;
			j=n-1;
			while(k<j)
			{
				aux=b[k];
				b[k]=b[j];
				b[j]=aux;
				k++;
				j--;
				
			}
			
			for(k=0;k<n;k++)
			{
				System.out.print(b[k]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}
		
}
