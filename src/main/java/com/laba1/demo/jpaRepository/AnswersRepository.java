package com.laba1.demo.jpaRepository;

import com.laba1.demo.entityes.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository <AnswerEntity,Integer> {

}
