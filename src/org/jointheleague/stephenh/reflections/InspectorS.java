package org.jointheleague.stephenh.reflections;

import java.lang.reflect.Method;

public class InspectorS {
	public static void main(String[] args) {
		InspectorS classInspector = new InspectorS();
		classInspector.printInfo(classInspector);
		//System.out.println("\n");
		//classInspector.printInfo(new Integer(0));
	}

	private void printInfo(Object theObj) {
		System.out.println(theObj.getClass().getName());
		System.out.println();
		for (Method m : theObj.getClass().getMethods()) {
			System.out.println(m.getReturnType() + " " + m.getName() /*+ "(" + m.getParameterTypes() + ")" */);
		}
	}
}
