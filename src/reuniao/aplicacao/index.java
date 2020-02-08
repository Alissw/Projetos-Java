package reuniao.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import reuniao.entidades.Participantes;
import reuniao.entidades.Reuniao;

/**
 * index
 */
public class index {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy");
        Scanner in = new Scanner(System.in);
        System.out.println("Marcar uma reunião");
        System.out.print("Assunto: ");
        String assunto = in.nextLine();
        System.out.print("Data: ");
        Date data = std.parse(in.next());
        System.out.print("Local: ");
        in.nextLine();
        String local = in.nextLine();
        Reuniao reuniao = new Reuniao(assunto, data, local);

        System.out.println();
        System.out.println("Adicionar participantes");
        System.out.print("Quantos participantes: ");
        int n = in.nextInt();
        in.nextLine();

        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.println("Dados do participante " + i);
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Cargo: ");
            String cargo = in.nextLine();
            Participantes participantes = new Participantes(nome, cargo);
            reuniao.addParticipantes(participantes);
        }    
        System.out.println();
        System.out.println("A reunião foi marcada com sucesso!");
        System.out.println("Data: " + std.format(reuniao.getData()));
        System.out.println("Assunto: " + reuniao.getAssunto());
        System.out.println("Local: " + reuniao.getLocal());
        System.out.println();
        
        System.out.println("Participantes da reunião: ");
        reuniao.mostraParticipantes();
        in.close();
    }
}