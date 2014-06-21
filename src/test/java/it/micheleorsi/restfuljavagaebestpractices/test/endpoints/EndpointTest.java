/**
 * 
 */
package it.micheleorsi.restfuljavagaebestpractices.test.endpoints;

import it.micheleorsi.restfuljavagaebestpractices.utils.Constants;
import it.micheleorsi.restfuljavagaebestpractices.web.MainGuice;

import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

/**
 * @author micheleorsi
 *
 */
public class EndpointTest extends JerseyTest {

	public EndpointTest() {
		super(new WebAppDescriptor.Builder()
        .contextListenerClass(MainGuice.class)
        .filterClass(com.google.inject.servlet.GuiceFilter.class)
        .servletPath(Constants.ROOT_PATH)
        .build());
	}
}
