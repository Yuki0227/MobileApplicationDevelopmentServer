package com.androidweb.repository;

import com.androidweb.entity.TaskAssign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskAssignRepository extends JpaRepository<TaskAssign,Integer> {


    /**
     * 根据创建者的creatorId来返回它创建的任务
     * @return 返回创建者对应的所有任务
     */
    @Query(value = "from TaskAssign where creatorId = ?1")
    List<TaskAssign> findAllByCreatorId(Integer creatorId);

    @Query(value = "from TaskAssign where assigneeId = ?1")
    List<TaskAssign> findTaskAssignedTask(Integer assigneeId);

    @Query(value = "from TaskAssign where creatorId = ?1 or assigneeId = ?2")
    List<TaskAssign> findAllTask(Integer creatorId, Integer assigneeId);
}
