package am.reverse.dto.product;

public class ProductDtoForUser {
    private String name;
    private String description;
    private Long reverseCoin;
    private String conditions;

    public ProductDtoForUser() {}

    public ProductDtoForUser(String name, String description, Long reverseCoin, String conditions) {
        this.name = name;
        this.description = description;
        this.reverseCoin = reverseCoin;
        this.conditions = conditions;
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

    public Long getReverseCoin() {
        return reverseCoin;
    }

    public void setReverseCoin(Long reverseCoin) {
        this.reverseCoin = reverseCoin;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
