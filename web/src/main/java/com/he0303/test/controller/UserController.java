package com.he0303.test.controller;

import com.he0303.test.entity.User;
import com.he0303.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {
	@Resource
	private UserService userService;

	@RequestMapping(value = "list")
	@ResponseBody
	public  List<User> list(Model model) {
		List<User> userList = userService.getAll();
		model.addAttribute("userList", userList);
		//return "userList";
		return userList;
	}
}
