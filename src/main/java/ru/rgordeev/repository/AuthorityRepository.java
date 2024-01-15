package ru.rgordeev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rgordeev.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
