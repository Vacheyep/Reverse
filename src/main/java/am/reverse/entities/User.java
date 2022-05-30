package am.reverse.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "phone_number")
    String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "id_address")
    Address address;

    @OneToMany(mappedBy = "user")
    List<Product> productList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
