package tk.tukuteam.ayudacompraApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.UserModel;

@RestController
@RequestMapping(value="/api/v1/user")
public class UserController {
	@GetMapping("/{email}")
	public UserModel getUserFromEmail(@PathVariable("email") String email) {
		return new UserModel();
	}
}
