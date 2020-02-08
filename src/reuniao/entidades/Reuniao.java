package reuniao.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Reuniao
 */
public class Reuniao {
    
    private String assunto;
    private Date data;
    private String local;

    private List<Participantes> participante = new ArrayList<>();

    public Reuniao(String assunto, Date data, String local) {
        this.assunto = assunto;
        this.data = data;
        this.local = local;
    }

    public void addParticipantes(Participantes nome){
        participante.add(nome);
    }

    public void mostraParticipantes(){
        for(Participantes p : participante){
            System.out.println(p.getNome() + ", " + p.getCargo());
        }
    }


    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}