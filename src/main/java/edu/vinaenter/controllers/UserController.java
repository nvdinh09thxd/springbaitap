package edu.vinaenter.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.models.Users;

@Controller
@RequestMapping("users")

public class UserController {
	@Autowired // DI
	private List<Users> listUsers = new ArrayList<Users>();
	private static final String MSG_SUCCESS = "Sign success";
	private static final String MSG_FAILURE = "Sign fail";

	@GetMapping("list")
	public String list(Model model) {
		System.out.println(123);
		return "users/list";
	}

	@PostMapping("singin")
	public String signin(Model model, HttpSession session, @ModelAttribute Users users) {
		users.getFullName();
		users.getUserName();
		users.getPassWord();
		users.setId(UUID.randomUUID().toString());
		listUsers.add(users);
		session.setAttribute("datas", listUsers);
		return "users/login";
	}

	@PostMapping("login")
	public String login(Model model, HttpSession session, @ModelAttribute Users users, RedirectAttributes re) {
		users.getUserName();
		users.getPassWord();
		if (session.getAttribute("datas") == null | users.getUserName() == null | users.getPassWord() == null) {
			re.addFlashAttribute("msg", MSG_FAILURE);
			return "redirect:/users/list";
		} else {
			re.addFlashAttribute("msg", MSG_SUCCESS);
			return "redirect:/users/list";
		}
	}

	@GetMapping("a")
	public String test(Model model) {
		return "users/a";
	}

}
