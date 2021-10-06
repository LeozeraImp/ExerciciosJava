package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
         public static void main(String args[])
         {
        	 Scanner leia = new Scanner(System.in);
        	 
        	 int segundosEvento = 0, calculoMinutos = 0, calculoSegundos = 0, restoHoras = 0, restoMinutos = 0, calculoHoras = 0;
        	 
        	 System.out.println("Quantos segundos tem o evento: ");
        	 segundosEvento = leia.nextInt();
        	 
        	 calculoHoras = segundosEvento / 3600;
        			 
        	 restoHoras = segundosEvento % 3600;
        	 
        	 calculoMinutos = restoHoras / 60;
        	 
        	 restoMinutos = restoHoras % 60;
        	 
        	 System.out.println("O evento tem " + calculoHoras + " horas " + calculoMinutos + " minutos " + restoMinutos + " segundos.");
         }
}
