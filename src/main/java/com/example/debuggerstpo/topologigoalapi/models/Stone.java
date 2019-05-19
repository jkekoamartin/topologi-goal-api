package com.example.debuggerstpo.topologigoalapi.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.*;

@EntityListeners(value = AuditingEntityListener.class)
@Entity(name = "Stone")
@Inheritance(strategy = InheritanceType.JOINED)

@Setter
@Getter
@ToString
public abstract class Stone {


    @Id
    @GeneratedValue(generator = "stoneIdSequence")
    @SequenceGenerator(name = "stoneIdSequence", sequenceName = "STONE_ID_SEQ", allocationSize = 1)
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DESC")
    String desc;

    @Column(name = "IS_COMPLETE")
    Boolean isComplete;

    @Column(name = "TYPE")
    String type;

    public Stone() {
    }

    public Stone(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.isComplete = false;
    }
}

