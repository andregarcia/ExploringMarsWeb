package andre.exploringmarsweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import andre.exploringmars.MarsExplorer;
import andre.exploringmars.exception.InvalidProbePositionException;


@Service
public class ExploringMarsService {

	
	public List<String> createProbesAndExploreMars(List<String> inputLines){
		List<String> output = MarsExplorer.createProbesAndExploreMars(inputLines);
		return output;
	}
	
	
}
