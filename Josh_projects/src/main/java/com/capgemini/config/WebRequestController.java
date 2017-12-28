package com.capgemini.config;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.service.Cart;
import com.capgemini.service.Catalog;
import com.capgemini.service.Order;
import com.capgemini.service.ProductList;
import com.capgemini.service.UseDetails;
import com.capgemini.serviceimpl.CartServiceimpl;

@Controller
public class WebRequestController {
	@Autowired
	public CartServiceimpl cartServiceimpl;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homeBeforeLogin(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		return "Home";
	}

	/*
	 * @RequestMapping(value = "/product", method = RequestMethod.POST) public
	 * String showProductPage(ModelMap model) { Cart cart =
	 * cartServiceimpl.getAllProduct(); model.addAttribute("productForm", cart);
	 * System.out.println(cart); return "productList"; }
	 * 
	 * @RequestMapping(value = "/order", method = RequestMethod.POST) public String
	 * showOrderPage(ModelMap model) { Cart cart = cartServiceimpl.getAllProduct();
	 * model.addAttribute("orderDetailInfo", cart); model.addAttribute("orderInfo",
	 * cart); System.out.println(cart); return "orderList"; }
	 */

	@RequestMapping(value = "/home1", method = RequestMethod.GET)
	public String homeAfterLogin(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName() + " " + userDetails.getlastName());
		return "index";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public String showOrderInfo(ModelMap model) {
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("userinfo", userDetails);
		model.addAttribute("name", userDetails.getfirstName() + " " + userDetails.getlastName());
		return "accountInfo";

	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(ModelMap model) {
		
		return "403";

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getAllProduct(ModelMap model) {
		ArrayList<ProductList> productlist = cartServiceimpl.getAllProduct();
		// UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("prodInfo", productlist);
		// model.addAttribute("details", userDetails);
		System.out.println(productlist);
		return "productList";
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String showOrderPage(ModelMap model) {
		ArrayList<ProductList> productlist = cartServiceimpl.getAllProduct();
		model.addAttribute("prodInfo", productlist);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("details", userDetails);
		
		return "orderList";
	}
	
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String cancelUpdateUser(HttpServletRequest request) {
	    return "redirect:/order";
	}
}
