package com.adaptorware.struts2;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.adaptorware.entity.Desktop;
import com.google.common.collect.Lists;

@ExceptionMappings({
    @ExceptionMapping(exception = "java.lang.NullPointerException", result = "success", params = {"param1", "val1"})
})
@Results({@Result(name="json", type="json",params={"root","beans"}) })
@ParentPackage("json-default")
public class MainAction extends AbstractAction<Desktop> {
	
	private static final Log logger = LogFactory.getLog(MainAction.class);
	private Collection<String> names = Lists.newArrayList();	
    private Collection<Desktop> beans;
	public String execute() throws Exception {
        return SUCCESS;
    }
	
	public String index() throws Exception{
		String name= null;
		name.toLowerCase();
		return "index";
	}

	public String json() throws Exception{
					
		com.opensymphony.xwork2.interceptor.ParametersInterceptor p;
		return "json";
	}
	
	public Collection<String> getNames() {
		return names;
	}

	public void setNames(Collection<String> names) {
		this.names = names;
	}

	public Collection<Desktop> getBeans() {
		return beans;
	}

	public void setBeans(Collection<Desktop> beans) {
		this.beans = beans;
	}	
}
