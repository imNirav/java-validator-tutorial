package imNirav.java.validator.vo;

import java.util.List;

import com.github.imNirav.java.validator.CheckForNull;

@CheckForNull(required= {"name","age","emailList","address","address.streetName"})
public class PersonVO {
	String name;
	Integer age;
	String role;
	List<String> emailList;
	AddressVO address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getEmailList() {
		return emailList;
	}
	public void setEmailList(List<String> emailList) {
		this.emailList = emailList;
	}
	public AddressVO getAddress() {
		return address;
	}
	public void setAddress(AddressVO address) {
		this.address = address;
	}
	
	
}
