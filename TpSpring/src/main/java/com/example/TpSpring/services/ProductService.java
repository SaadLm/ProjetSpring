package com.example.TpSpring.services;

import com.example.TpSpring.entities.Product;
import com.example.TpSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

public ProductService(ProductRepository productRepository){
    this.productRepository = productRepository;
}

    //////      Méthode pour ajouter un produit
    public Product ajouterProduit(Product product){
        return productRepository.save(product);
    }


    ////////   ila kanet chi function (findAll,save...) deja dakhla f JPA Ra kanktebha directement hna walakin ila kanet mam3roufach f JPA khessni nktebha f Repo bach t defina


    ///////    Methode pour recuperer tous les produits
    public List<Product> listerProduits(){
        return productRepository.findAll();
    }
}
