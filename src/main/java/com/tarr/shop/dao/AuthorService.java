package com.tarr.shop.dao;

import com.tarr.shop.model.Author;
import com.tarr.shop.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll() {
        return (List<Author>) authorRepository.findAll();
    }

    public Optional<Author> getOne(Integer id) {
        return authorRepository.findById(id);
    }

    public void addNew(Author author) {
        authorRepository.save(author);
    }

    public void update(Author author) {
        authorRepository.save(author);
    }

    public void delete(Integer id) {
        authorRepository.deleteById(id);
    }
}
