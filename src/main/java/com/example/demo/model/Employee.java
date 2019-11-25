package com.example.demo.model;

import java.util.List;

public class Employee {
	
	private String id;
	private String fullName;
	private String currentRole;
	private String email;
	private String mobile;
	private List<String> skills;
	private List<String> qualifications;
	private String resume;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String fullName, String currentRole, String email, String mobile, List<String> skills,
			String resume, List<String> qualifications) {
		this.id = id;
		this.fullName = fullName;
		this.currentRole = currentRole;
		this.email = email;
		this.mobile = mobile;
		this.skills = skills;
		this.resume = resume;
		this.qualifications = qualifications;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public List<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	
}
