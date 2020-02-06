package contratos.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import contratos.entidades.Tabalhador;
import contratos.entidades.enums.NivelTrabalho;
import contratos.entidades.ContratoHora;
import contratos.entidades.Departamento;

/**
 * Aplicativo
 */
public class Aplicativo {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamento = in.nextLine();

        System.out.println("Dados do trabalhador: ");
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Nível: ");
        String nivel = in.nextLine();
        System.out.print("Salário base: ");
        Double salarioBase = in.nextDouble();
        Tabalhador tabalhador = new Tabalhador(nome, NivelTrabalho.valueOf(nivel), salarioBase, new Departamento(departamento));

        System.out.print("Quantos contratos serão feitos? ");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Contrato " + i + "#");
            System.out.print("Data (DD/MM/YYY): ");
            Date data = std.parse(in.next());
            System.out.print("Valor por hora: ");
            Double valorHora = in.nextDouble();
            System.out.print("Duração em hora: ");
            int horas = in.nextInt();
            ContratoHora contrato = new ContratoHora(data, valorHora, horas);
            tabalhador.addContrato(contrato);            
        }

        System.out.print("Entre com o mês e ano (MM/YYYY) para calcular o ganho: ");
        String MesEAno = in.next();
        int mes = Integer.parseInt(MesEAno.substring(0,2));
        int ano = Integer.parseInt(MesEAno.substring(3));

        System.out.println("Nome: " + tabalhador.getNome());
        System.out.println("Departamento: " + tabalhador.getDepartamento().getNome());
        System.out.println("Renda referente à " + MesEAno + ": " + String.format("%.2f", tabalhador.renda(mes, ano)));


        in.close();
    }
}
