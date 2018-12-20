package com.proserv.logwatch.repository;

import com.proserv.logwatch.model.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Long> {

    List<Watch> findAll();

    void deleteByName(String name);

}
