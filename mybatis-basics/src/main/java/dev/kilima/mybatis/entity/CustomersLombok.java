package dev.kilima.mybatis.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data 
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CustomersLombok {
	private Integer id;
	private String name;
	private String city;
	private String email;
	private String phone;
}
