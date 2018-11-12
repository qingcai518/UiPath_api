package jp.bctech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import jp.bctech.entity.Exercise;
import jp.bctech.service.ExerciseService;

@RestController
@RequestMapping("/v1/exercise")
public class ExerciseController {
	@Autowired
	ExerciseService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Exercise> fetchAll(@RequestParam(value="chapter_id") Long chapterId) {
		return service.fetchBy(chapterId);
	}
}