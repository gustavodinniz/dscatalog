package br.com.gustavodiniz.dscatalog.services;

import br.com.gustavodiniz.dscatalog.entities.Category;
import br.com.gustavodiniz.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
