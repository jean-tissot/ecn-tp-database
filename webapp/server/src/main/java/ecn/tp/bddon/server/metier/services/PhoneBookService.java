package ecn.tp.bddon.server.metier.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ecn.tp.bddon.server.metier.dto.mongo.PhoneBook;
import ecn.tp.bddon.server.metier.repository.PhoneBookRestRepository;

@Service
public class PhoneBookService {

    @Resource
    private PhoneBookRestRepository phoneBookRestRepository;

    public Iterable<PhoneBook> getInfoTables() {
        return phoneBookRestRepository.findAll();
    }

}
