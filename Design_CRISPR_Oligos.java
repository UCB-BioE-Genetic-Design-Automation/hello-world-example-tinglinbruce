package org.bioe134.crispr;

import javafx.util.Pair;

/**
 *
 * @author J. Christopher Anderson
 */
public class Design_CRISPR_Oligos {
    
    public void initiate() throws Exception {
        
        //TODO:  write this initiate (if needed)
        
    }
    
    public Pair<String,String> run(String cds) throws Exception {
        
        //TODO:  write this algorithm, put the oligo sequences in line below

        String oligos1 = "";
        for (int i = 0; i <(cds.toCharArray().length-23); i++) {
            if (cds.substring(i, i+23).startsWith("GG") && !cds.substring(i+3, i+23).contains("GG")) {
                oligos1 = cds.substring(i, i+23);
                break;
            }
        }
        String oligos2 =  "ctcagACTAGTattatacctaggactgagctag";
        Pair<String,String> out = new Pair<>(oligos1, oligos2);
        return out;
    }
    
    public static void main(String[] args) throws Exception {
        //Create some example arguments, here the amilGFP coding sequence
        String cds = "ATGTCTTATTCAAAGCATGGCATCGTACAAGAAATGAAGACGAAATACCATATGGAAGGCAGTGTCAATGGCCATGAATTTACGATCGAAGGTGTAGGAACTGGGTACCCTTACGAAGGGAAACAGATGTCCGAATTAGTGATCATCAAGCCTGCGGGAAAACCCCTTCCATTCTCCTTTGACATACTGTCATCAGTCTTTCAATATGGAAACCGTTGCTTCACAAAGTACCCGGCAGACATGCCTGACTATTTCAAGCAAGCATTCCCAGATGGAATGTCATATGAAAGGTCATTTCTATTTGAGGATGGAGCAGTTGCTACAGCCAGCTGGAACATTCGACTCGAAGGAAATTGCTTCATCCACAAATCCATCTTTCATGGCGTAAACTTTCCCGCTGATGGACCCGTAATGAAAAAGAAGACCATTGACTGGGATAAGTCCTTCGAAAAAATGACTGTGTCTAAAGAGGTGCTAAGAGGTGACGTGACTATGTTTCTTATGCTCGAAGGAGGTGGTTCTCACAGATGCCAATTTCACTCCACTTACAAAACAGAGAAGCCGGTCACACTGCCCCCGAATCATGTCGTAGAACATCAAATTGTGAGGACCGACCTTGGCCAAAGTGCAAAAGGCTTTACAGTCAAGCTGGAAGCACATGCCGCGGCTCATGTTAACCCTTTGAAGGTTAAATAA";
        
        //Instantiate and initiate the Function
        Design_CRISPR_Oligos func = new Design_CRISPR_Oligos();
        func.initiate();
        
        //Run the function on the example
        Pair<String,String> oligos = func.run(cds);
        
        //Print out the result
        System.out.println("oligo1: " + oligos.getKey());
        System.out.println("oligo2: " + oligos.getValue());
    }
}