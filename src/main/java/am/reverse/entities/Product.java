package am.reverse.entities;

import am.reverse.enums.ProductType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "location")
    String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_type")
    ProductType productType;

    @Column(name = "reverse_coin")
    Long reverseCoin;

    @Column(name = "description")
    String description;

    @Column(name = "measure")
    String measure;

    @Column(name = "count")
    Long count;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

//    @OneToMany(mappedBy = "product")
//    List<Factory> factoryList;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getReverseCoin() {
        return reverseCoin;
    }

    public void setReverseCoin(Long reversePoint) {
        this.reverseCoin = reverseCoin;
    }
}
