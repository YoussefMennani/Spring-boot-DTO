package com.spring.dto.Repository;

import com.spring.dto.Model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
