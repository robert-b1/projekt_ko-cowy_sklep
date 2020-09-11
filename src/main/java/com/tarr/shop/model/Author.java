package com.tarr.shop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//Adnotacje lombokowe
@Getter
@Setter
@NoArgsConstructor
public class Author {

    @Id
    private Integer id;
    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
