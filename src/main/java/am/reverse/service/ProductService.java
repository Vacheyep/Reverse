package am.reverse.service;

import am.reverse.dto.product.ProductDtoForGuest;
import am.reverse.entities.Product;
import am.reverse.exeption.ResourceNotFoundException;
import am.reverse.mapper.ProductMapper;
import am.reverse.mapper.UserMapper;
import am.reverse.repository.ProductRepository;
import am.reverse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper,
                          UserRepository userRepository, UserMapper userMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public ProductDtoForGuest createProduct(ProductDtoForGuest productDtoForGuest) {
        Product productToSave = this.productMapper.toProductForGuest(productDtoForGuest);
        Product savedProduct = this.productRepository.save(productToSave);
        return productMapper.toProductDtoForGuest(savedProduct);
    }

//    public ProductDtoForGuest getAllProduct(){
//        Product allProducts = productRepository.getAll();
//        return productMapper.toProductDtoForGuest(allProducts);
//    }

    public ProductDtoForGuest getProduct (String name){
        if (productRepository.existsByName(name)) {
            Product productToGet = productRepository.findByName(name);
            return productMapper.toProductDtoForGuest(productToGet);
        }else {
            throw new ResourceNotFoundException("product by this name didn't exists");
        }

    }
    public void deleteProduct(String name){
        Optional<Product> product = Optional.ofNullable(this.productRepository.findByName(name));
        if (product.isEmpty()) {
            throw new ResourceNotFoundException("Product not found");
        }
        productRepository.delete(product.get());
    }
}
