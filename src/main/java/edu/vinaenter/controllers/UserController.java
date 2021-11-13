package edu.vinaenter.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

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

	private List<Users> listUsers;
	private static final String MSG_SUCCESS = "Sign success";
	private static final String MSG_FAILURE = "Sign fail";

	public UserController() {
		super();
		listUsers = new ArrayList<>();
	}

	@GetMapping("list")
	public String list(Model model) {
		return "users/list";
	}

	@GetMapping("signup")
	public String signup() {
		return "users/signup";
	}
	
	@GetMapping("login")
	public String login() {
		return "users/login";
	}

	@PostMapping("signup")
	public String signupHandle(HttpSession session, @ModelAttribute Users users) {
		users.setId(UUID.randomUUID().toString());
		listUsers.add(users);
		session.setAttribute("datas", listUsers);
		return "redirect:/users/login";
	}

	@PostMapping("login")
	public String loginHandle(Model model, HttpSession session, @ModelAttribute Users users, RedirectAttributes re) {
		if (session.getAttribute("datas") == null || users.getUsername() == "" || users.getPassword() == "") {
			re.addFlashAttribute("msg", MSG_FAILURE);
			return "redirect:/users/list";
		} else {
			re.addFlashAttribute("msg", MSG_SUCCESS);
			return "redirect:/users/list";
		}
	}

}
