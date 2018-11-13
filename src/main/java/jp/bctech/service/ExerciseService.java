package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.ExerciseRepository;
import jp.bctech.entity.Exercise;

import java.util.*;

@Service
@Transactional
public class ExerciseService {
	@Autowired
	ExerciseRepository repository;
	
	public List<Exercise> fetchAll() {
		return repository.findAll();
	}
	
	public List<Exercise> fetchBy(Long chapterId) {
		Exercise exercise = new Exercise();
		exercise.setChapterId(chapterId);
		
		Example<Exercise> example = Example.of(exercise);
		
//		return repository.findAll();
		return repository.findAll(example);
	}
}
