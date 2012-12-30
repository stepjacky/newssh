package com.adaptorware.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Desktop implements Serializable {
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1213152610807152701L;
	private String id;
    private String name;
    
    @Id
    @GenericGenerator(name="systemUUID",strategy="org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator="systemUUID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
