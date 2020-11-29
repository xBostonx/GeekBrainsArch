package repositories;

import entities.Entity;

public interface Repository {
    Entity getById(Long id);
    void editById(Long id);
    void deleteById(Long id);
}
