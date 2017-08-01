package com.dao;

import com.problem.problem;
import com.user.user;

public interface ProblemDao {
	public void addProblem(int user_id, problem p);
	public problem showProblemById(int id);
	public problem queryProblemById(int id);
	public void updateProblem(int user_id, int problem_id, problem p1);
	public void deleteProblem(int user_id, int problem_id);
	public user queryUserById(int id);
}
