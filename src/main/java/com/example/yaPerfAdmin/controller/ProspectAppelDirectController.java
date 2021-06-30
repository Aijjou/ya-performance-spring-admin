package com.example.yaPerfAdmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.yaPerfAdmin.service.ProspectAppelDirectService;

@Controller
public class ProspectAppelDirectController {

	@Autowired
	ProspectAppelDirectService prospectAppelDirectService;

	@RequestMapping(value = "/admin/liste-prospect-appel", method = RequestMethod.GET)
	String getAllProspectAppel(Model model) {

		model.addAttribute("liste", prospectAppelDirectService.findAll());

		return "/admin/liste-prospect-appel";
	}

}
