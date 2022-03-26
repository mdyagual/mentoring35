package co.com.sofka.mentoring35.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dado {
    @Id
    private String id;
    private Integer numero;
    private String fecha;
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public Dado(Integer numero) {
        this.numero = numero;
        this.fecha = sdf1.format(System.currentTimeMillis());
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    
}
