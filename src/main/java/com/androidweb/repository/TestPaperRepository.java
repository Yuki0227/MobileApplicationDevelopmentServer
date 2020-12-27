package com.androidweb.repository;

import com.androidweb.entity.TestPaper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestPaperRepository extends JpaRepository<TestPaper,Integer> {
}
