package org.everit.meetup.itests;

import org.everit.meetup.core.MyComponent;
import org.everit.osgi.dev.testrunner.TestDuringDevelopment;
import org.everit.osgi.ecm.annotation.Component;
import org.everit.osgi.ecm.annotation.Service;
import org.everit.osgi.ecm.annotation.ServiceRef;
import org.everit.osgi.ecm.annotation.attribute.StringAttribute;
import org.everit.osgi.ecm.annotation.attribute.StringAttributes;
import org.everit.osgi.ecm.extender.ExtendComponent;
import org.junit.Test;

@ExtendComponent
@Component
@StringAttributes({ @StringAttribute(attributeId = "eosgi.testId", defaultValue = "myTest"),
	@StringAttribute(attributeId = "eosgi.testEngine", defaultValue = "junit4")})
@Service
public class MyTest {

	private MyComponent myComponent;
	
	@ServiceRef(defaultValue = "")
	public void setMyComponent(MyComponent myComponent) {
		this.myComponent = myComponent;
	}
	
	@Test
	@TestDuringDevelopment
	public void simpleCrud() {
		System.out.println(myComponent.addTodo(""));
	}
}
