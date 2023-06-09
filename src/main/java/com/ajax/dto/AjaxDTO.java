package com.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor	//모든 필드의 값을 인풋 받는 생성자
@ToString
@NoArgsConstructor	//기본 생성자
public class AjaxDTO {
	
	private String param1;
	
	private String param2;
}
