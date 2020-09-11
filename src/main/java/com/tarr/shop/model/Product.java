package com.tarr.shop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
//Adnotacje lombokowe
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    private Integer id;
    private String name;
    private String description;
    //private URL icon
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate created;

    public Product(String name, String description, Category category, BigDecimal price, Author author, LocalDate created) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.author = author;
        this.created = created;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getDescription();
    }
}
