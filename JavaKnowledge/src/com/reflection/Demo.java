package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method; 

public class Demo {

	public static void main(String[] args) throws Exception{
	 
        Test obj = new Test("fasdfd"); 
   
Class clsClass=obj.getClass();

Constructor c=clsClass.getConstructor();
System.out.println(c);

Method[] m=clsClass.getMethods();
for(Method m1:m) {
	System.out.println(m1);
}

Method method1=clsClass.getDeclaredMethod("m2", int.class);

method1.invoke(clsClass, 19); 
Field f=clsClass.getDeclaredField("s");

f.setAccessible(true);
f.set(obj, "dsdasfasfdasf");
System.out.println("call private "+f);
System.out.println(method1);  

Method m3=clsClass.getDeclaredMethod("m3");
m3.invoke(obj);
  
//        Method methodcall1 = cls.getDeclaredMethod("method2", 
//                                                 int.class); 
//  
//        // invokes the method at runtime 
//        methodcall1.invoke(obj, 19); 
//  
//        Field field = cls.getDeclaredField("s"); 
//  
//   
//        field.setAccessible(true); 
//
//        field.set(obj, "JAVA"); 
//  
//      
//        Method methodcall2 = cls.getDeclaredMethod("method1"); 
//  
//        methodcall2.invoke(obj); 
//  
//        Method methodcall3 = cls.getDeclaredMethod("method3"); 
//  
//    
//        methodcall3.setAccessible(true); 
//  
//     
//        methodcall3.invoke(obj); 

	}

}
