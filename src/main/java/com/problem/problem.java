package com.problem;

import java.util.Set;

import com.user.user;

public class problem {
	private int problem_id;
	private String problem_name;
	private String problem_content;
	private String problem_labels;
	private Set<user> users;
	public int getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(int problem_id) {
		this.problem_id = problem_id;
	}
	public String getProblem_name() {
		return problem_name;
	}
	public void setProblem_name(String problem_name) {
		this.problem_name = problem_name;
	}
	public String getProblem_content() {
		return problem_content;
	}
	public void setProblem_content(String problem_content) {
		this.problem_content = problem_content;
	}
	public String getProblem_labels() {
		return problem_labels;
	}
	public void setProblem_labels(String problem_labels) {
		this.problem_labels = problem_labels;
	}
	public Set<user> getUsers() {
		return users;
	}
	public void setUsers(Set<user> users) {
		this.users = users;
	}
	
	
}
