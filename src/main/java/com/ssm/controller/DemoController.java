/*package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.jsp.jstl.core.Config;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="demo")
public class DemoController {

	@SuppressWarnings("rawtypes")
	@Resource(name="redisTemplate")
	private RedisTemplate redisTemplate;

	@RequestMapping("/test")
	@ResponseBody  //将控制器方法返回的对象通过适当的转换器转换为指定的格式 通常用于返回json数据或者是xml
	public String test1(){
		String str="消息1";
		redisTemplate.convertAndSend("channel1", str);
		return "消息1发送成功！";
	}
	@RequestMapping("/test")
	@ResponseBody
	public String test2(){
		String str2="消息2";
		redisTemplate.convertAndSend("channel2", str2);
		return "消息2发送成功！";
	}

}
*/