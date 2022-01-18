package br.com.gustavodiniz.dscatalog.services;

import br.com.gustavodiniz.dscatalog.dto.CategoryDTO;
import br.com.gustavodiniz.dscatalog.entities.Category;
import br.com.gustavodiniz.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}
