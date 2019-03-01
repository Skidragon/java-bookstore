package com.lambdaschool.bookstore.repositories;

import com.lambdaschool.bookstore.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
