package com.user;

import java.util.HashSet;
import java.util.Set;

import com.job.job;
import com.problem.problem;

public class user {
	private Integer user_id;
	private String user_name;
	private String user_password;
	private Set<problem> problems;
	private Set<job> jobs = new HashSet<job>();
	
	public user(){
	}
	public user(String name, String password){
		this.user_name = name;
		this.user_password = password;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public Set<problem> getProblems() {
		return problems;
	}
	public void setProblems(Set<problem> problems) {
		this.problems = problems;
	}
	public Set<job> getJobs() {
		return jobs;
	}
	public void setJobs(Set<job> jobs) {
		this.jobs = jobs;
	}
	
	
}
