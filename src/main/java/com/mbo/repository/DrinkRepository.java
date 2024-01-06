package com.mbo.repository;

import com.mbo.model.Drink;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DrinkRepository extends CrudRepository<Drink, UUID> {
}
