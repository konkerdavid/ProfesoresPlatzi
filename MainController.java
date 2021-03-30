/**
 * 
 */
package com.platzi.profesoresplatzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author david
 *
 */
@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String reponse ="Bienvenido a <a href= 'http://platzi.com'> platzi.com</a>";
		return reponse;
	}
	

}
