package com.kindsonthegenius.fleetms.hr.models;

import com.kindsonthegenius.fleetms.parameters.models.CommonObject;

import groovy.transform.EqualsAndHashCode;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class JobTitle extends CommonObject {
	
}
