package com.tarr.shop.cotroller;

import com.tarr.shop.dao.AuthorService;
import com.tarr.shop.model.Author;
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
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Author> authors = authorService.getAll();
        model.addAttribute("authors", authors);
        return "authors";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Author> getOne(Integer id) {
        return authorService.getOne(id);
    }

    @PostMapping("/addNew")
    public String addNew(Author author) {
        authorService.addNew(author);
        return "redirect:/authors/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Author author) {
        authorService.update(author);
        return "redirect:/authors/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer Id) {
        authorService.delete(Id);
        return "redirect:/authors/getAll";
    }
}
