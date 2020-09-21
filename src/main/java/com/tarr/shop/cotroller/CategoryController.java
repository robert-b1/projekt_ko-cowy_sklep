package com.tarr.shop.cotroller;

import com.tarr.shop.dao.CategoryService;
import com.tarr.shop.model.Category;
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
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "categories";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Category> getOne(Integer id) {
        return categoryService.getOne(id);
    }

    @PostMapping("/addNew")
    public String addNew(Category category) {
        categoryService.addNew(category);
        return "redirect:/categories/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Category category) {
        categoryService.update(category);
        return "redirect:/categories/getAll";
    }

    @RequestMapping(value = "/delate", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer Id) {
        categoryService.delete(Id);
        return "redirect:/caterories/getAll";
    }
}
