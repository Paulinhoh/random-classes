package com.example.bonusrepository.repository;

import com.example.bonusrepository.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoReposiitory extends JpaRepository<ProdutoModel, Long> {

}
