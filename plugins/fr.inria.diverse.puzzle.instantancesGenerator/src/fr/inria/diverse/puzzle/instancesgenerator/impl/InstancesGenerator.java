package fr.inria.diverse.puzzle.instancesgenerator.impl;

import java.io.IOException;
import java.util.List;

import fr.inria.diverse.generator.pcm.InstanceVO;
import fr.inria.diverse.generator.pcm.PCMGenerator;

public class InstancesGenerator {

	public List<InstanceVO> generateInstances(String folder) throws IOException{
		PCMGenerator generator = new PCMGenerator();
		return generator.generateAllPCMs(folder);
	}
}
