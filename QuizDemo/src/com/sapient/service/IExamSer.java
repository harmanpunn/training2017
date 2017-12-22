package com.sapient.service;
import java.util.List;

import com.sapient.vo.*;
public interface IExamSer {
	
	List<Question> generateQuestions();
	int evaluate(List<Answer> alist);

}
