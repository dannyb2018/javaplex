package edu.stanford.math.plex4.homology.streams.utility;

import java.util.ArrayList;
import java.util.List;

import edu.stanford.math.plex4.homology.streams.interfaces.AbstractFilteredStream;

public class StreamUtility {
	public static <T> List<T> getModuleBasis(AbstractFilteredStream<T> stream, int dimension, boolean increasingDimensionality) {
		List<T> basis = new ArrayList<T>();
		
		for (T basisElement: stream) {
			int elementDimension = stream.getDimension(basisElement);
			if (elementDimension == dimension) {
				basis.add(basisElement);
			} else if (elementDimension > dimension && increasingDimensionality) {
				break;
			}
		}
		return basis;
	}
	
	public static <T> List<T> getAllBasisElements(AbstractFilteredStream<T> stream) {
		List<T> basis = new ArrayList<T>();
		
		for (T basisElement: stream) {
			basis.add(basisElement);
		}
		
		return basis;
	}
	
	
}