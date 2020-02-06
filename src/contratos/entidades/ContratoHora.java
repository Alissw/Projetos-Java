package contratos.entidades;

import java.util.Date;

/**
 * ContratoHora
 */
public class ContratoHora {

    Date data;
    Double valorHora;
    Integer horas;


    public ContratoHora(Date data, Double valorHora, Integer horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }



    public Date getData() {
        return this.data;
    }

    Double valorTotal(){
        return valorHora * horas;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return this.horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

}