package main;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        try {
            Scanner scanner = new Scanner(System.in);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

            String a;

            System.out.println("Insira a data desejada: (aaaa-mm-dd)");
            a = scanner.nextLine();

            LocalDate data = LocalDate.parse(a);

            LocalDate datas[] = new LocalDate[5];
            datas[0] = data;
            datas[1] = data.plusDays(7);
            datas[2] = data.plusDays(14);
            datas[3] = data.plusDays(21);
            datas[4] = data.plusDays(28);

            for (int i = 0; i < 5; i++) {
                System.out.println("Data: " + datas[i]);
            }

        } catch (NumberFormatException ne) {
            System.out.println("Erro de entrada inválida: " + ne.getMessage());
        } catch (NullPointerException nue) {
            System.out.println("Erro de entrada nula: " + nue.getMessage());
        } catch (Exception e) {
            // mostra os erros no console
            e.printStackTrace();
            //tratamento da exceção
            System.out.println("Mensagem do erro: " + e.getMessage()
                    + "\nClasse do erro: " + e.getClass());
        }
    }
}