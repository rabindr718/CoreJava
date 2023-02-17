package ReflectionEx;

import java.lang.reflect.Method;

public class UsingReflection {

	public static void main(String[] args) {

		Class cls=A.class;
		Method method[]=cls.getDeclaredMethods();
		
		for(Method meth: method) 
		{
			System.out.print(meth.getName());
			System.out.print(meth.getReturnType());
			System.out.print(meth.invoke());
		}
	}

}
