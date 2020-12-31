import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> codons = new ArrayList<String>();
        List<String> proteins = new ArrayList<String>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            codons.add(rnaSequence.substring(i, i + 3));
        }

        for (String codon : codons) {
            if (codon.equals("AUG")) {
                proteins.add("Methionine");
            } else if (codon.equals("UUU") || codon.equals("UUC")) {
                proteins.add("Phenylalanine");
            } else if (codon.equals("UUA") || codon.equals("UUG")) {
                proteins.add("Leucine");
            } else if (codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG")) {
                proteins.add("Serine");
            } else if (codon.equals("UAU") || codon.equals("UAC")) {
                proteins.add("Tyrosine");
            } else if (codon.equals("UGU") || codon.equals("UGC")) {
                proteins.add("Cysteine");
            } else if (codon.equals("UGG")) {
                proteins.add("Tryptophan");
            } else if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
                return proteins;
            }
        }
        return proteins;
    }
}