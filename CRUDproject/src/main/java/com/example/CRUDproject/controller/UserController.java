package com.example.CRUDproject.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.CRUDproject.enitity.User;

@Controller
public class UserController {
	@Autowired
	 SessionFactory factory;
	List<User> list;
	//User userfromDB;
	@RequestMapping("/")//Home Page
	public String addUser()
	{
		return "input";
	}
	@RequestMapping("add")
	public ModelAndView getRegistered(User user)
	{
		Session session=factory.openSession();
		session.save(user);
		Transaction tx=session.beginTransaction();
		tx.commit();
		ModelAndView model=new ModelAndView();
		model.setViewName("input");
		model.addObject("added","Data Added to DataBase");
		return model;
	}
	@RequestMapping("update")
	public ModelAndView getUpdate(User user)
	{
		Session session=factory.openSession();
		session.load(User.class, user.getUsername());
		session.update(user);
		session.beginTransaction().commit();
		ModelAndView model=new ModelAndView();
		model.setViewName("input");
		model.addObject("Edited","Successfully Upadated");
		return model;
		
	}
	@RequestMapping("delete")
	public ModelAndView getDeleted(User user)
	{
		Session session=factory.openSession();
		User userfromDB=session.load(User.class,user.getUsername());
		session.delete(userfromDB);
		session.beginTransaction().commit();
		ModelAndView model=new ModelAndView();
		model.setViewName("input");
		model.addObject("deleted", "Data deleted");
		return model;
	}
	@RequestMapping("getALL")
	public ModelAndView getData(User user)
	{
		Session session=factory.openSession();
		Query querry=session.createQuery("from User");
		list=querry.list();
		ModelAndView model =new ModelAndView();
		model.setViewName("AllUsers");
		model.addObject("data", list);
		return model;
	}
	
	

}
