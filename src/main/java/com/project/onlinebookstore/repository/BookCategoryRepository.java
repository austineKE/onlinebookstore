package com.project.onlinebookstore.repository;

import com.project.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="bookCateogry", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
