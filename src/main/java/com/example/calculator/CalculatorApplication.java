package com.example.calculator;

import com.example.calculator.work.Calculate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculate calculate = new Calculate();

		int num1, num2;
		char oper;

		System.out.println("only support +,-,*,/");
		num1 = scan.nextInt();
		oper = scan.next().charAt(0);
		num2 = scan.nextInt();

		switch (oper) {
			case '+' :
				System.out.println("답 " +num1+" + "+num2+" = "+Calculate.add(num1, num2));
			break;

			case '-' :
				System.out.println("답 " +num1+" - "+num2+" = "+Calculate.min(num1, num2));
			break;

			case '*' :
				System.out.println("답 " +num1+" * "+num2+" = "+Calculate.mul(num1, num2));
			break;

			case '/' :
				System.out.println("답 " +num1+" / "+num2+" = "+Calculate.div(num1, num2));
			break;
		}
	}

}
