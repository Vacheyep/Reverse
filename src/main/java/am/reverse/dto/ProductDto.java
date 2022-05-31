package am.reverse.dto;

import javax.persistence.Column;

public class ProductDto {
    String name;
    String description;
    String measure;

    public ProductDto(){}

    public ProductDto(String name, String description, String measure) {
        this.name = name;
        this.description = description;
        this.measure = measure;
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
}
