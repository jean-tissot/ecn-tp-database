package ecn.tp.bddon.server.metier.repository;

import org.springframework.data.repository.CrudRepository;

import ecn.tp.bddon.server.metier.dto.Client;

public interface OrderContentRestRepository extends CrudRepository<Client, Integer> {

}
