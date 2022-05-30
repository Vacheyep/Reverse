package am.reverse.entities;

import javax.persistence.*;

@Entity
@Table(name = "factory")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
