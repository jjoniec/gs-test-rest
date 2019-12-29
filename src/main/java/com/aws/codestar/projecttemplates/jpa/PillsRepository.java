package com.aws.codestar.projecttemplates.jpa;

import com.aws.codestar.projecttemplates.dao.Pills;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PillsRepository extends CrudRepository<Pills, Long> {

    List<Pills> findByName(String name);
    Pills findById(long id);
}
