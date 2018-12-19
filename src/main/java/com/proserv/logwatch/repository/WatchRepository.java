package com.proserv.logwatch.repository;

import com.proserv.logwatch.model.Watch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchRepository extends CrudRepository<Watch, Long> {

    List<Watch> findAll();

    void deleteByName(String name);

}
