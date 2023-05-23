package com.revature.FullStackTestServer.beans.repositories;

import com.revature.FullStackTestServer.models.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Integer> {

}
