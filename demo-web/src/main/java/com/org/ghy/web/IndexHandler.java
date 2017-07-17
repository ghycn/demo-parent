package com.org.ghy.web;

import com.alibaba.fastjson.JSON;
import com.org.ghy.entity.UserEntity;
import com.org.ghy.service.user.IUserService;
import com.org.ghy.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class IndexHandler {

	@Autowired
	private IUserService userService;

	@ResponseBody
	@RequestMapping(value="/test.do")
	public String init(){
		String time = DateUtil.format(new Date(), DateUtil.YYYYMMDD24HHMMSS);

		List<UserEntity> list = userService.queryUserList();

		return JSON.toJSONString(list);
	}
}
