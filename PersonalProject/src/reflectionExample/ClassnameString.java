package reflectionExample;

import java.lang.reflect.Method;

public class ClassnameString {
	public static void main(String[] args) throws Exception{
		String className="reflectionExample.A";
		Object obj=Class.forName(className).newInstance();
		System.out.println("Class Name : "+obj.getClass().getName());
		Method[] methods = obj.getClass().getDeclaredMethods();
		for(Method method:methods)
			System.out.println("Method Name : "+method);
		Method methodCallSetB = obj.getClass().getDeclaredMethod("setB", int.class);
		methodCallSetB.invoke(obj, 4);
		Method methodCallGetB=obj.getClass().getDeclaredMethod("getB");
		Object var = methodCallGetB.invoke(obj);
		System.out.println("Value of the varible : "+var);
		System.out.println("Check Instance : "+obj.getClass().isInstance(obj));
	}
}
