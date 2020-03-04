package com.ua.es.labproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class Joke {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Id
    private String id;
    private String date;
    private String value;

    //@Embedded
    //private Category category;

    @Override
    public String toString() {
        return "Quote{" +
                "date='" + date + '\'' +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }

    public Joke() {
        this.date = dateFormat.format(new Date());
    }
}
