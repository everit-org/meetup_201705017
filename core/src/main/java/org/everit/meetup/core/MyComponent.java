package org.everit.meetup.core;

import java.util.Collection;
import java.util.Collections;

import org.everit.osgi.ecm.annotation.Component;
import org.everit.osgi.ecm.annotation.Service;
import org.everit.osgi.ecm.annotation.attribute.LongAttribute;
import org.everit.osgi.ecm.extender.ExtendComponent;

@ExtendComponent
@Component
@Service(MyComponent.class)
public class MyComponent {

	private long num;
	
	@LongAttribute(defaultValue = 6)
	public void setNum(long num) {
		this.num = num;
	}
	
	public long addTodo(String text) {
		return num;
	}
	
	public void removeTodo(long todoId) {
		
	}
	
	public Collection<String> listTodos() {
		return Collections.emptyList();
	}
}
