package am.reverse.mapper;

import am.reverse.dto.product.ProductDtoForAdmin;
import am.reverse.dto.product.ProductDtoForGuest;
import am.reverse.dto.product.ProductDtoForUser;
import am.reverse.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toProductForGuest(ProductDtoForGuest productDtoForGuest){
        Product product = new Product();
        product.setName(productDtoForGuest.getName());
        product.setDescription(productDtoForGuest.getDescription());
        product.setReverseCoin(productDtoForGuest.getReverseCoin());

        return product;
    }

    public ProductDtoForGuest toProductDtoForGuest(Product product){
        ProductDtoForGuest productDtoForGuest = new ProductDtoForGuest();
        productDtoForGuest.setName(product.getName());
        productDtoForGuest.setDescription(product.getDescription());
        productDtoForGuest.setReverseCoin(product.getReverseCoin());
        return productDtoForGuest;
    }
//    public Product toProductForUser(ProductDtoForUser productDtoForUser){
//
//    }
//    public ProductDtoForUser toProductDtoForUser(Product product){
//
//    }
//    public Product toProductForAdmin(ProductDtoForAdmin productDtoForAdmin){
//
//    }
//    public ProductDtoForAdmin toProductDtoForAdmin(Product product){
//
//    }
}
