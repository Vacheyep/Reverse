package am.reverse.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address",
 uniqueConstraints = { @UniqueConstraint(name = "UC_CP", columnNames = { "country", "city" })})
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "address")
    List<User> users;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
