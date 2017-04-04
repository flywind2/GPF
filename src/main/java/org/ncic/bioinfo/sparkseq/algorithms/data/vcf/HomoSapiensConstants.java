package org.ncic.bioinfo.sparkseq.algorithms.data.vcf;

/**
 * Author: wbc
 */
public class HomoSapiensConstants {

    /**
     * Standard heterozygous rate for SNP variation.
     */
    public static final double SNP_HETEROZYGOSITY = 1e-3;

    /**
     * Standard heterozygous rate for INDEL variation.
     */
    public static final double INDEL_HETEROZYGOSITY = 1.0/8000;

    /**
     * Standard ploidy for autosomal chromosomes.
     */
    public static final int DEFAULT_PLOIDY = 2;
}
