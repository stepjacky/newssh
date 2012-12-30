package com.adaptorware;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class Tools {
	private static final Log logger = LogFactory.getLog(Tools.class);
    public void doIt(){
    	logger.info("I'm do it");
    }
}
