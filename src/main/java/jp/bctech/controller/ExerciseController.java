package jp.bctech.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.bctech.entity.Exercise;
import jp.bctech.service.ExerciseService;

//@RestController
//@RequestMapping("/v1/exercise")

@Controller
@EnableAutoConfiguration
public class ExerciseController {
	@Autowired
	ExerciseService service;
	
	@RequestMapping("/v1/exercise")
	@ResponseBody
	public List<Exercise> fetchAll(@RequestParam(value="chapter_id") Long chapterId) {
		return service.fetchBy(chapterId);
	}
	
	@RequestMapping("/v1/test")
	@ResponseBody
	public List<Exercise> fetchRandom(@RequestParam(value="limit") Long limit) {
		List<Exercise> list = service.fetchAll();
		List<Exercise> result = new ArrayList<Exercise>();
		
		Random random = new Random();
		int[] values = random.ints(0, list.size()).distinct().limit(limit).toArray();
		for (int value : values) {
			result.add(list.get(value));
		}
		return result;
	}
}