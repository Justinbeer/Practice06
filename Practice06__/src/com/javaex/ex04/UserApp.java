package com.javaex.ex04;

import java.util.LinkedList;

public class UserApp {

	public static void main(String[] args) {
		LinkedList<User> userList = new LinkedList<>();
		
		Customer customer1 = new Customer("jws", "j1234", "정우성", 1000);
		Employee employee1 = new Employee("master", "m7788", "운영자", 500);
		
		userList.add(customer1);
		userList.add(employee1);
		System.out.println("출력");
		for (User user : userList) {
			user.showInfo();
		}
		// 마지막 직원가져오기
		Employee lastEmployee = (Employee) userList.getLast();
		// 마지막직원의 월급 출력
		System.out.println("월급 : " + lastEmployee.getSalary());
	}

}
