package com.org.web;

import com.alibaba.fastjson.JSON;
import org.demo.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IndexHandler {
	@ResponseBody
	@RequestMapping(value="/test.do")
	public String init(){
		String str = "13246";

		String time = DateUtil.format(new Date(), DateUtil.YYYYMMDD24HHMMSS);
		
		return JSON.toJSONString(time);
	}
}
