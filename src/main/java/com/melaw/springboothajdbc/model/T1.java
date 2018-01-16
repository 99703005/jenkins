package com.melaw.springboothajdbc.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by MeLaw on 2018/1/12.
 */
@Entity
@Table(name = "t1")
@Data
public class T1 {

    @Id
    @Column(name = "i")
    private int i;

}

