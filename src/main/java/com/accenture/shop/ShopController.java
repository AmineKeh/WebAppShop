package com.accenture.shop;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import product.ProductCatalogue;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ShopController {
	
	@Autowired
	private ProductCatalogue productCatalogue;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String books(Locale locale, Model model) {
		model.addAttribute(productCatalogue);
		return "books";
	}
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart(Locale locale, Model model) {
		
		return "cart";
	}
	@RequestMapping(value = "/pay", method = {RequestMethod.GET,RequestMethod.POST})
	public String pay(Locale locale, Model model) {
		
		return "pay";
	}		
}
