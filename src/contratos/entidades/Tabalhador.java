package contratos.entidades;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import contratos.entidades.enums.NivelTrabalho;
/**
 * Tabalhador
 */
public class Tabalhador {

    String nome;
    NivelTrabalho nivel;
    Double salarioBase;

    Departamento departamento;
    List<ContratoHora> contratos = new ArrayList<>();


    public Tabalhador(String nome, contratos.entidades.enums.NivelTrabalho nivelTrabalho, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivelTrabalho;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public void addContrato(ContratoHora contrato){
        contratos.add(contrato);
    }

    public void removeContrato (ContratoHora contrato){
        contratos.remove(contrato);
    }

    public double renda(int mes, int ano){
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(ContratoHora c: contratos){
            cal.setTime(c.getData());
            int c_mes = 1 + cal.get(Calendar.MONTH);
            int c_ano = cal.get(Calendar.YEAR);
            if(mes == c_mes  &&  ano==c_ano ){
                sum += c.valorTotal();
            }
        }
        return sum;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivel() {
        return this.nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return this.contratos;
    }
}