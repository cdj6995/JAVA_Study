package kr.ac.kopo.day12;

import java.util.Objects;

public class Member {

	private String name;
	private String phone;
	
	public Member() {}
	
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
//		Member m = (Member)obj; => ((Member)obj)   / 명시적 형변환
		if(this.name != null && !this.name.equals( ((Member)obj).name)) {
			return false;
		}
		
		if(this.phone != null && !this.phone.equals( ((Member)obj).phone)) {
			return false;
		}
		return true;
	}
	*/
}
