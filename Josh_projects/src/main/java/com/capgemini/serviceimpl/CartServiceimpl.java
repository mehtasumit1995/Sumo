package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.capgemini.service.Cart;
import com.capgemini.service.CartService;
import com.capgemini.service.Catalog;
import com.capgemini.service.Order;
import com.capgemini.service.ProductList;
import com.capgemini.service.UseDetails;

@Service
public class CartServiceimpl implements CartService {
	@Override
	public Cart getAllCart() {

		/*
		 * String uri = URLConstants.URL + "/{id}"; System.out.println(uri); Map<String,
		 * String> params = new HashMap<String, String>(); params.put("userId", "1");
		 * RestTemplate restTemplate = new RestTemplate(); Cart result =
		 * restTemplate.getForObject(uri, Cart.class, params);
		 * System.out.println(result); System.out.println(result)
		 */;

		Cart cart = new Cart();
		cart.setEducation("sdfsafas");
		cart.setUserId("1234");
		return cart;
	}

	@Override
	public ArrayList<Catalog> getDetails() {
		ArrayList<Catalog> col = new ArrayList<Catalog>();

		Catalog cat = new Catalog();
		cat.setName("aaaaaaaa");
		cat.setPrice(00);
		Catalog cat1 = new Catalog();
		cat1.setName("bbbbbbbbbb");
		cat1.setPrice(00);
		Catalog cat2 = new Catalog();
		cat2.setName("cccccccccc");
		cat2.setPrice(00);
		Catalog cat3 = new Catalog();
		cat3.setName("aaaaaaaaaa");
		cat3.setPrice(00);
		Catalog cat4 = new Catalog();
		cat4.setName("dddddddda");
		cat4.setPrice(00);
		Catalog cat5 = new Catalog();
		cat5.setName("aaaaaaaaa");
		cat5.setPrice(00);
		col.add(cat);
		col.add(cat1);
		col.add(cat2);
		col.add(cat3);
		col.add(cat4);
		col.add(cat5);
		return col;
	}

	/*
	 * public Cart getAllProduct() {
	 * 
	 * Cart cart = new Cart(); cart.setPrimarySkill("abcdefg");
	 * cart.setSecondarySkill("hijklmn"); cart.setUserId("1234"); return cart;
	 * 
	 * }
	 * 
	 * public Cart getAllOrder() {
	 * 
	 * Cart cart = new Cart(); cart.setPrimarySkill("abcdefg");
	 * cart.setSecondarySkill("hijklmn"); cart.setUserId("1234"); return cart;
	 * 
	 * }
	 */

	@Override
	public UseDetails getAllDetails() {
		UseDetails UseDetails = new UseDetails();
		UseDetails.setfirstName("xyz");
		UseDetails.setlastName("modiSSS");
		UseDetails.setgender("male");
		UseDetails.setemailId("xyz@gmail.com");
		UseDetails.setId("asassdfedf");
		return UseDetails;

	}

	public ArrayList<ProductList> getAllProduct() {

		ProductList productlist = new ProductList();
		productlist.setProductId("1234");
		productlist.setProductName("abc");
		productlist.setProductPrice("100");

		ProductList productlist1 = new ProductList();
		productlist1.setProductId("1234");
		productlist1.setProductName("abc");
		productlist1.setProductPrice("100");

		ProductList productlist2 = new ProductList();
		productlist2.setProductId("1234");
		productlist2.setProductName("abc");
		productlist2.setProductPrice("100");

		ProductList productlist3 = new ProductList();
		productlist3.setProductId("1234");
		productlist3.setProductName("abc");
		productlist3.setProductPrice("100");

		ArrayList<ProductList> pro = new ArrayList<ProductList>();
		pro.add(productlist);
		pro.add(productlist1);
		pro.add(productlist2);
		pro.add(productlist3);

		return pro;
	}

	public ArrayList<Order> getAllOrder() {
		Order order = new Order();
		order.setName("qwert");
		order.setEmail("siaohi");
		order.setPhone("1234");
		order.setAddress("bangalore");
		
		Order order1 = new Order();
		order1.setName("qwert");
		order1.setEmail("siaohi");
		order1.setPhone("1234");
		order1.setAddress("bangalore");
		
		Order order2 = new Order();
		order2.setName("qwert");
		order2.setEmail("siaohi");
		order2.setPhone("1234");
		order2.setAddress("bangalore");
		
		Order order3 = new Order();
		order3.setName("qwert");
		order3.setEmail("siaohi");
		order3.setPhone("1234");
		order3.setAddress("bangalore");
		
		ArrayList<Order> ord=new ArrayList<Order>();
		ord.add(order);
		ord.add(order1);
		ord.add(order2);
		ord.add(order3);
		return ord;

	}
}
