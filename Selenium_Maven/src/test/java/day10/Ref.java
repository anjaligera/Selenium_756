package day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.testng.annotations.Test;

public class Ref {
  @Test
  public void f() throws Exception{ // we are inspecting firefox in this program we are trying to find all firefox constructors , field name, method name
	  
	  
	  Class cl=Class.forName("org.openqa.selenium.firefox.FirefoxDriver"); // package name with class name
	  Constructor[] CS= cl.getConstructors();
	  
	  for(Constructor C:CS)// to get the name of all constructors
	  {
		  System.out.println(C.getName());
	  }
	 
	  Field[] DF=cl.getDeclaredFields();// to get all declared variables
	  for(Field F: DF)
	  {
		  System.out.println(F.getName());
	  }
	//Webdriver is an interface and remote driver n web driver ko implement kia and remote driver ko firefox driver n extend kia
	  System.out.println(cl.getSuperclass());// superclass of firefox driver Remote driver
	//yahan superclass s matlb firefox s hai not remote driver
	Method[] MD=  cl.getMethods();
	for(Method M:MD)
	{
		System.out.println(M.getName());
		Parameter PM[] =M.getParameters();
		for(Parameter P : PM)
		{
			System.out.println(P.getParameterizedType()+" ");//parameter type
			System.out.println(P.getName()+" ");//parameter name
		
		}
	
	}

  }
}
