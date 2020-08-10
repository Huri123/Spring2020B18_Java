package day08_IfStatements;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
AVERAGEGRADE90-100A80-89B70-79C60-69D0-59F
 */
public class MulyiBranchIf_Practice {
    public static void main(String[] args) {
        double score = 89.5; //max score is 100
        //assume that grade is 0~100

        boolean AGrade = score >= 90 && score <= 100;
        boolean BGrade = score >= 80 && score < 90;
        boolean CGrade = score >= 70 && score < 80;
        boolean DGrade = score >= 60 && score < 70;

        char grade = ' ';

        if (AGrade){
            grade ='A';
        } else if (BGrade){
            grade ='B';
        } else if (CGrade){
            grade ='C';
        } else if (DGrade){
            grade ='D';
        }else {
            grade = 'F';
        }
        System.out.println( "Score "+score +" is: "+grade );
    }
}
