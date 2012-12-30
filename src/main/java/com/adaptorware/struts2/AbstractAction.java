package com.adaptorware.struts2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public abstract class AbstractAction<M extends java.io.Serializable> implements ModelDriven<M>,Action {

	private M bean;
	
	@Override
	public M getModel() {
		
		return bean;
	}
	
	
	public M getBean() {
		return bean;
	}
	public void setBean(M bean) {
		this.bean = bean;
	}
	
}
