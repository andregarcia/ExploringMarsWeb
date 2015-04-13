package andre.exploringmarsweb.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import andre.exploringmars.exception.InvalidInputException;
import andre.exploringmars.exception.InvalidProbePositionException;
import andre.exploringmars.input.InputValidator;
import andre.exploringmarsweb.service.ExploringMarsService;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;


@Controller
public class ExploringMarsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExploringMarsController.class);
	
	
	@Inject
	private ExploringMarsService exploringMarsService;
	
	
	@ResponseBody
	@RequestMapping(value="explore/mars", method=RequestMethod.POST, consumes = {"multipart/*"})
	public ResponseEntity<String> exploreMars(@RequestParam(value="file", required=true) MultipartFile file){
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()));
			List<String> inputLines = Lists.newArrayList();
			String line;
			
			while((line = br.readLine())!=null){
				inputLines.add(line);
			}
			br.close();
			
			return doExploreMars(inputLines);
			
		} catch (IOException e) {
			LOGGER.error("Error reading input file", e);
			return new ResponseEntity<String>("Error reading input file", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value="explore/mars", method=RequestMethod.POST, params={"form"})
	public ResponseEntity<String> exploreMars(@RequestParam(value="input", required=true) String input) {
		List<String> inputLines = Lists.newArrayList(input.split("\n"));
		return doExploreMars(inputLines);
	}
	
	
	
	
	
	
	
	private ResponseEntity<String> doExploreMars(List<String> inputLines){
		try{
			
			InputValidator.validateInput(inputLines);
			
			List<String> output = exploringMarsService.createProbesAndExploreMars(inputLines);
			String outputStr = Joiner.on("\n").join(output);
			return new ResponseEntity<String>(outputStr, HttpStatus.OK);
			
		} catch(InvalidInputException e){
			LOGGER.error("Input is invalid", e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		} catch(InvalidProbePositionException e){
			LOGGER.error("Invalid probe position", e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
