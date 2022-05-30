package am.reverse.entities;

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

    @Column(name = "description")
    String description;

    @Column(name = "count")
    Long count;

    @Column(name = "measure")
    String measure;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

    @OneToMany(mappedBy = "product")
    List<Factory> factoryList;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
