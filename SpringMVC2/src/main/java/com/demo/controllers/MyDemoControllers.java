package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Account;

@Controller
public class MyDemoControllers {

	@RequestMapping(value = "/createAccount")
	public String createAccount(
			@Valid @ModelAttribute("aNewAccount") Account account,
			BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("form has errors");
			return "createAccount";
		}

		System.out.println(account.getFirstName() + " " + account.getLastName()
				+ " " + account.getEmailID());

		return "createAccount";
	}

	@RequestMapping(value = "/accountCreated", method=RequestMethod.POST)
	public String performAccount(Account account) {

		System.out.println(account.getFirstName() + " " + account.getLastName()
				+ " " + account.getEmailID());

		return "accountCreated";
	}

}
