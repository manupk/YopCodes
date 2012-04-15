/*
 * Copyright (c) 2008 American Power Conversion, All Rights Reserved
 */
package com.manu.mix.example1.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tBuswaySKUGrouping")
public class BuswaySKUGrouping  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2426916877639363993L;

    @Id
    @Column(name = "BGId")
    private Integer buswayGroupId;
    
    @Column(name = "BuswayTabName")
    private String buswayTabName;
    
    @Column(name = "RegionId")
    private Integer regionId;
    
    @Column(name = "CmpId")
    private Integer componentId;
    
}
