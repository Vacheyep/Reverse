package am.reverse.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "address")
    String address;

    @OneToMany(mappedBy = "address")
    List<User> users;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
