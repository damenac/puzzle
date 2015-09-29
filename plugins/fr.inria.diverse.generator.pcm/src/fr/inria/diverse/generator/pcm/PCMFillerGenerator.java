package fr.inria.diverse.generator.pcm;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;

public class PCMFillerGenerator {

	public static String fillPCM(Graph<Vertex, Arc> graph, String PCM) {

		SimpleSolver solver = new SimpleSolver();
		for (Arc arc : graph.getArcs()) {
			solver.createRequires("\"" + arc.getFrom().getIdentifier() + "\"",
					"\"" + arc.getTo().getIdentifier() + "\"");
		}

		Collection<String> mandatoryFeatures = getAllCoreMandatory(PCM);
		for (String mandatoryFeature : mandatoryFeatures) {
			solver.createMandatory(mandatoryFeature);
		}

		for (String rel : getAllRequires(PCM)) {
			String orig = rel.substring(0, rel.indexOf(';'));
			String dest = rel.substring(rel.indexOf(';') + 1, rel.length());
			solver.createRequires(orig, dest);
		}

		for (String rel : getAllExcludes(PCM)) {
			String orig = rel.substring(0, rel.indexOf(';'));
			String dest = rel.substring(rel.indexOf(';') + 1, rel.length());
			solver.createExcludes(orig, dest);
		}

		return solver.solve();
	}

	public static Collection<String> getAllCoreMandatory(String PCM) {
		Collection<String> res = new LinkedList<String>();
		PCMQueryServices.getInstance().loadPCM(PCM);
		Set<String> getAllFeatures = PCMQueryServices.getInstance()
				.getAllFeatures();
		for (String feature : getAllFeatures) {
			if (!(PCMQueryServices.getInstance()
					.existsProductWithoutFeature(feature))) {
				res.add(feature);
			}
		}
		return res;
	}

	public static Collection<String> getAllRequires(String PCM) {
		Collection<String> res = new LinkedList<String>();
		PCMQueryServices.getInstance().loadPCM(PCM);
		Set<String> allFeatures = PCMQueryServices.getInstance()
				.getAllFeatures();
		for (String orig : allFeatures) {
			for (String dest : allFeatures) {
				if (!orig.equals(dest)
						&& PCMQueryServices.getInstance()
								.allProductsWithFeatureAHaveAlsoFeatureB(orig,
										dest)) {
					res.add(orig + ";" + dest);
				}
			}
		}
		return res;
	}

	public static Collection<String> getAllExcludes(String PCM) {
		Collection<String> res = new LinkedList<String>();

		PCMQueryServices.getInstance().loadPCM(PCM);
		for (String origin : PCMQueryServices.getInstance().getAllFeatures()) {
			for (String destination : PCMQueryServices.getInstance()
					.getAllFeatures()) {
				if (!origin.equals(destination)) {
					if (!origin.equals(destination)
							&& PCMQueryServices.getInstance()
									.allProductsWithFeatureAExcludeFeatureB(
											origin, destination)) {
						res.add(origin + ";" + destination);
					}
				}
			}
		}
		return res;
	}
}
