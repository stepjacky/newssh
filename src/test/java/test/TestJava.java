package test;

import static org.junit.Assert.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.adaptorware.struts2.MainAction;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestJava {
    Log logger = LogFactory.getLog(TestJava.class);
	@Test
	public void test() {
		MainAction ti = new MainAction();
		
		Type fc = ti.getClass().getGenericSuperclass();
		if(fc instanceof  ParameterizedType){
			ParameterizedType pt = (ParameterizedType) fc; 

			Type[] ppt = pt.getActualTypeArguments(); // 得到泛型里的class类型对象。 
		 
			
			for(Type t:ppt){
			   Class cls = (Class) t;
			   logger.info(cls.getName());
			}
			
			
		    
		}
	}

}

class TestType<T extends java.io.Serializable>{
	
}

class TestIns extends TestType<String>{
	
}