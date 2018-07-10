package com.javaee.klenner.springjpamysql.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaee.klenner.springjpamysql.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
