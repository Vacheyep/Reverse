package am.reverse.dto.product;

public class ProductDtoForGuest {
    private String name;
    private String description;
    private Long reverseCoin;
//    public String locatione;
//    private Long count;

    public ProductDtoForGuest(){}

    public ProductDtoForGuest(String name, String description, Long reverseCoin)  {
        this.name = name;
        this.description = description;
        this.reverseCoin = reverseCoin;
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

    //    public Long getCount() {
//        return count;
//    }
//
//    public void setCount(Long count) {
//        this.count = count;
//    }
}
