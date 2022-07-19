package lazizbek.uz.pcmarket_uz.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Characteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private Boolean active = true;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Property property;


    public Characteristic() {
    }

    public Characteristic(Integer id, String name, Boolean active, Product product, Property property) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.product = product;
        this.property = property;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}

