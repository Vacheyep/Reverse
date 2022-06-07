package am.reverse.dto.product;

public class ProductDtoForAdmin {
    private Long id;
    private Long count;
    private String description;
    private String location;
    private String name;
    private String conditions;
    private String reverseCoin;

    public ProductDtoForAdmin(Long id, Long count, String description, String location,
                              String name, String conditions, String reverseCoin) {
        this.id = id;
        this.count = count;
        this.description = description;
        this.location = location;
        this.name = name;
        this.conditions = conditions;
        this.reverseCoin = reverseCoin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getReverseCoin() {
        return reverseCoin;
    }

    public void setReverseCoin(String reverseCoin) {
        this.reverseCoin = reverseCoin;
    }
}
