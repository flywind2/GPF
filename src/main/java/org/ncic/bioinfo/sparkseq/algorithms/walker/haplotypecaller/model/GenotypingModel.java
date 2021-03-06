package org.ncic.bioinfo.sparkseq.algorithms.walker.haplotypecaller.model;

import htsjdk.variant.variantcontext.Allele;
import org.ncic.bioinfo.sparkseq.algorithms.walker.haplotypecaller.AlleleList;
import org.ncic.bioinfo.sparkseq.algorithms.walker.haplotypecaller.GenotypingData;
import org.ncic.bioinfo.sparkseq.algorithms.walker.haplotypecaller.GenotypingLikelihoods;

/**
 * Author: wbc
 */
public interface GenotypingModel {

    /**
     * Calculate genotype likelihoods given the genotype data and the set of
     * alleles to genotype upon.
     *
     * @param genotypingAlleles the target alleles.
     * @param data the data (read-likelihoods and ploidy) to genotype
     * @param <A> the allele type.
     *
     * @throws IllegalArgumentException if {@code genotypingData} or {@code genotypingAlleles} is {@code null},
     *   or {@code genotypingData} does not cover the requested alleles.
     *
     * @return never {@code null}.
     */
    public <A extends Allele> GenotypingLikelihoods<A> calculateLikelihoods(final AlleleList<A> genotypingAlleles, final GenotypingData<A> data);
}

