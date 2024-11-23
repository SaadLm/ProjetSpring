package com.example.TpSpring.controllers;

import com.example.TpSpring.entities.Product;
import com.example.TpSpring.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@Controller
@RequestMapping("/produits")
public class ProduitController {
    private final ProductService productService ;

    public ProduitController(ProductService productService){
        this.productService = productService;
    }

    // afficher la liste des produits
    @GetMapping
    public String afficherListeProduits(Model model){
        List<Product> produits = productService.listerProduits();
        // injecyter la liste dans le modele
        model.addAttribute("produits",produits);
        model.addAttribute("titre","gestion des produits");
        // returner la kvue 'liste.html' dans le dossier 'produits'
        return "produits/liste";
    }

}
