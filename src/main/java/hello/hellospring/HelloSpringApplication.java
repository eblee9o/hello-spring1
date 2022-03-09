package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
//같은 패키지 안에 있어야함!! 없으면 주입 오류!!
	/*
	* 스프링 빈을 등록하는 방법
	* 1. 컴포넌트 스캔과 자동 의존관계 설정 :: @Controller / @Service / @Repository
	* 2. 자바 코드로 직접 스프링 빈 등록하기 */
}
