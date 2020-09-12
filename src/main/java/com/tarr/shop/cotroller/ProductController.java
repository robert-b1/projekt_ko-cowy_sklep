package com.tarr.shop.cotroller;

import com.tarr.shop.dao.ProductService;
import com.tarr.shop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "products";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Product> getOne(Integer id) {
        return productService.getOne(id);
    }

    @PostMapping("/addNew")
    public String addNew(Product product) {
        productService.addNew(product);
        return "redirect:/products/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Product product) {
        productService.update(product);
        return "redirect:/products/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer Id) {
        productService.delete(Id);
        return "redirect:/products/getAll";
    }
}
