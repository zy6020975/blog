package group.zhouyang.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import group.zhouyang.blog.model.User;
import group.zhouyang.blog.service.IUserService;

/** 
* @描述:
* @author 周阳 
* @date 创建时间：2018年5月18日 下午5:13:01
* @version v1.0
*/
@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@GetMapping("/")
	public String hello(){
		User user = new User();
		user.setAge(1);
		user.setName("zz");
		user.setSex("女");
		userService.save(user);
		return "hello world";
		
	}
	@ResponseBody
	@GetMapping("/{id}")
	public List<User> find(@PathVariable("id") int id){
		
		return userService.findById(id);
	}
	
}
