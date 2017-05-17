package org.everit.meetup.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MeetupActivator implements BundleActivator {

	public void start(BundleContext arg0) throws Exception {
		System.out.println("////////////// Hello OSGi world");
	}

	public void stop(BundleContext arg0) throws Exception {
		System.out.println("///////////// Bye OSGi world");
	}

}
