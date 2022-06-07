package am.reverse.entities;

import am.reverse.enums.ProductCondition;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "id_product_type", foreignKey = @ForeignKey(name = "product_productType_fk"))
    private ProductType productType;

    @Column(name = "reverse_coin")
    private Long reverseCoin;

    @Column(name = "descriptions")
    private String descriptions;

    @Enumerated(EnumType.STRING)
    @Column(name = "conditions")
    private ProductCondition productCondition;


    @Column(name = "count")
    private Long count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bag_id",
            foreignKey = @ForeignKey(name = "bag_product_fk"))
    private Bag bag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "product_user_fk"))
    private User user;

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
        return descriptions;
    }

    public void setDescription(String description) {
        this.descriptions = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
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
