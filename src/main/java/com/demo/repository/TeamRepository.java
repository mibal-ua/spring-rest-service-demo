package com.demo.repository;

import com.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mykhailo Balakhon
 * @link <a href="mailto:9mohapx9@gmail.com">9mohapx9@gmail.com</a>
 */
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
