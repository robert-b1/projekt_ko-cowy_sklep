package com.tarr.shop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//Adnotacje lombokowe
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    private Integer id;
    private String name;
    @ManyToOne
    private Category parent;

    public Category(Integer id, String name, Category parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
