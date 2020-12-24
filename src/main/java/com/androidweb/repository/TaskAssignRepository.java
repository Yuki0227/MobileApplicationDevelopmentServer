package com.androidweb.repository;

import com.androidweb.entity.TaskAssign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskAssignRepository extends JpaRepository<TaskAssign,Integer> {


}
