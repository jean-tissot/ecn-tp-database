package ecn.tp.bddon.server.metier.repository;

import org.springframework.data.repository.CrudRepository;

import ecn.tp.bddon.server.metier.dto.Product;

public interface ProductRestRepository extends CrudRepository<Product, Integer> {

}
