package com.demo.repository;

import com.demo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mykhailo Balakhon
 * @link <a href="mailto:9mohapx9@gmail.com">9mohapx9@gmail.com</a>
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
