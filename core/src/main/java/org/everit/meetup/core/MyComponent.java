package org.everit.meetup.core;

import java.util.Collection;
import java.util.Collections;

import org.everit.osgi.ecm.annotation.Activate;
import org.everit.osgi.ecm.annotation.Component;
import org.everit.osgi.ecm.annotation.Service;
import org.everit.osgi.ecm.extender.ExtendComponent;

@ExtendComponent
@Component
@Service(MyComponent.class)
public class MyComponent {

	public long addTodo(String text) {
		return 0;
	}
	
	public void removeTodo(long todoId) {
		
	}
	
	public Collection<String> listTodos() {
		return Collections.emptyList();
	}
}
