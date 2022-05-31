package am.reverse.mapper;

import am.reverse.dto.ProductDto;
import am.reverse.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toProduct(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setMeasure(productDto.getMeasure());
        return product;
    }

    public ProductDto toProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setMeasure(product.getMeasure());
        return productDto;
    }
}
