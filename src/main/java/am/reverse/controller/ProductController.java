package am.reverse.controller;

import am.reverse.dto.product.ProductDtoForGuest;
import am.reverse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDtoForGuest productDtoForGuest) {
        Assert.notNull(productDtoForGuest, "Given product is null!");
        ProductDtoForGuest user = productService.createProduct(productDtoForGuest);
        return new ResponseEntity<>(
                "Product was created", HttpStatus.OK
        );
    }
//    @GetMapping
//    public ResponseEntity<?> getAllProduct(@RequestBody List<ProductDtoForGuest> productDtoForGuestList){
//        List<ProductDtoForGuest> productList = productService.getAllProduct();
//        return new ResponseEntity<>(
//                productList, HttpStatus.OK
//        );
//
//    }

    @GetMapping("/name")
    public ResponseEntity<?> getProduct(@RequestParam String name){
        ProductDtoForGuest productDtoForGuest = productService.getProduct(name);
        return new ResponseEntity<>(
                productDtoForGuest, HttpStatus.OK
        );
    }
    @DeleteMapping
            ("/{name}")
    public ResponseEntity<?> deleteProduct(@PathVariable("name") String name) {
        productService.deleteProduct(name);
        return new ResponseEntity<>(
                "Product was deleted ", HttpStatus.OK
        );
    }
}

