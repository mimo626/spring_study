package com.example.springedu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MyVO {
	private int myNumber;
	private String myColor;

//	@Override
//	public String toString() {
//		return "MyVO{" +
//				"myNumber=" + myNumber +
//				", myColor='" + myColor + '\'' +
//				'}';
//	}
}
