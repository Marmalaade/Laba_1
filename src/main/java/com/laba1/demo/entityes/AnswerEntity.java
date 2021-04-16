package com.laba1.demo.entityes;

import javax.persistence.*;
@Entity
@Table(schema = "public", name = "answers")
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;

    @Column(name = "answer_value", nullable = false)
    private Integer asnwer_value;

    public AnswerEntity() {

    }

    public AnswerEntity(Integer answerId, Integer asnwer_value) {
        this.answerId = answerId;
        this.asnwer_value = asnwer_value;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getAsnwer_value() {
        return asnwer_value;
    }

    public void setAsnwer_value(Integer asnwer_value) {
        this.asnwer_value = asnwer_value;
    }

    @Override
    public String toString() {
        return "Answer [answerId=" + answerId + "answer_value=" + asnwer_value + "]";
    }
}
