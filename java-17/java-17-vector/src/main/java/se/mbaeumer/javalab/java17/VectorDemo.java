package se.mbaeumer.javalab.java17;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorDemo {

    private static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;


    public void newVectorComputation(int[] a, int[] b, int[] c) {
        for (var i = 0; i < a.length; i += SPECIES.length()) {
            var m = SPECIES.indexInRange(i, a.length);
            var va = IntVector.fromArray(SPECIES, a, i, m);
            var vb = IntVector.fromArray(SPECIES, b, i, m);
            var vc = va.mul(vb);
            vc.intoArray(c, i, m);
        }
    }
}
