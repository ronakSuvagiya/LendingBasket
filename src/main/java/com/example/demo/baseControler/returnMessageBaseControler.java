package com.example.demo.baseControler;

import com.example.demo.dto.returnMessageDto;

public class returnMessageBaseControler {

	public returnMessageDto sucessMsg(Integer code, String message, returnMessageDto obj)
	{
		obj.setCode(code);
		obj.setMessage(message);
		return obj;		
	}
	public returnMessageDto errorMsg(Integer code, String message, returnMessageDto obj)
	{
		obj.setCode(code);
		obj.setMessage(message);
		return obj;		
	}
	public returnMessageDto exceptionMsg(Integer code, String message, returnMessageDto obj)
	{
		obj.setCode(code);
		obj.setMessage(message);
		return obj;		
	}
}
