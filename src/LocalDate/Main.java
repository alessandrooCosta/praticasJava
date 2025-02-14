/*
LocalDate
Exercício:
1. Crie um programa que:
   - Leia uma data de nascimento do usuário e calcule sua idade.
   - Exiba a data do próximo aniversário.
   - Verifique se o próximo aniversário cai em um final de semana.

2. Gere uma lista com as datas dos próximos 10 dias a partir da data atual.
 */
package LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //- Leia uma data de nascimento do usuário e calcule sua idade.
        System.out.println("Informe a sua data de nascimento: ");
        Scanner scan = new Scanner(System.in);
        String dataNascimento = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Cria o formato da Data.
        LocalDate dataConvertida = LocalDate.parse(dataNascimento, formatter); // Converte a String recebida para o formato estipulado.
        LocalDate dataAtual = LocalDate.now(); // pega a data atual;
        Period idade = Period.between(dataConvertida,dataAtual); // between
        System.out.println("A sua idade é: " + idade.getYears() + " anos"); // getYear converte para anos.

        // - Exiba a data do próximo aniversário.
        LocalDate AniversarioDesteAno = LocalDate.of(dataAtual.getYear(),dataConvertida.getMonth(),dataConvertida.getDayOfMonth()); // Criamos uma data de aniversário para o ano atual usando o LocalDate.of();
        if(AniversarioDesteAno.isBefore(dataAtual)){ // Usamos isBefore() para verificar se o aniversário deste ano já passou.
            AniversarioDesteAno = AniversarioDesteAno.plusYears(1); // Se já passou, adicionamos 1 ano ao aniversário usando plusYears(1)
        }
        System.out.println("Proximo aniversario: " + formatter.format(AniversarioDesteAno)); // .format para pegar a formatação criada anteriormente.

        // - Verifique se o próximo aniversário cai em um final de semana.
        if(AniversarioDesteAno.getDayOfWeek() == DayOfWeek.SATURDAY || AniversarioDesteAno.getDayOfWeek() == DayOfWeek.SUNDAY){
            System.out.println("Seu proximo aniversario será no final de semana! ");
        }else{
            System.out.println("Seu proximo aniversario Não será no final de semana! ");
        }

        //2. Gere uma lista com as datas dos próximos 10 dias a partir da data atual.
        




    }
}
