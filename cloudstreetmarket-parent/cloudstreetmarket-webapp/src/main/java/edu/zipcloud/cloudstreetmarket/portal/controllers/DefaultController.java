/**
 * 
 */
package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Jagannath Mishra
 *
 */
@Controller
public class DefaultController {
	
	@RequestMapping(value="/*", method={RequestMethod.GET,RequestMethod.HEAD})
    public String fallback() {    
		return "index";  
		} 
		
}
	

