package day37_Constructors;

public class CybertekStudents {//How we initialize that, in the constructor.bunu gosterecek
    // static String schoolName;//burda boyle initialize yapmazsak CObjects classinda reinitialize yaparken sadece reinitialize ettigimiz object i degistirir
    static String schoolName="Cybertek University";//burda boyle initialize yaparsak CObjects classinda reinitialize yaparken hepsini ayni degistirir.
    String studentName; //we must need to know
    int groupNumber; //we must need to know
    String batch; //we must need to know

    public CybertekStudents(String studentName,int groupNumber,String batch){//schoolname static her ogrenci oraya
                                                                // gidiyor o yuzden onu paranteze yazmaya gerek yok
       // schoolName="Cybertek University";//static.it is already common o yuzden paranteze yazmadik

        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;

    }
    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber+", School name: "+schoolName;
    }
}
 class CObjects{
     public static void main(String[] args) {
         CybertekStudents student1=new CybertekStudents("Drar",3,"Batch 18");
     student1.schoolName="MIT"; // yukarida static schoolname i initialize etmezsek boyle yaptigimizda Drar in okulu degisir ama Sarah in degismez
                                            //ama yukarda initialize yaparsak hem Drarr'in hem de Sarah in schoolu degisir
         System.out.println(student1);

         CybertekStudents student2=new CybertekStudents("Sarah",12,"Batch 18");
         System.out.println(student2);//her ogrencide cybertek university ayni gelecek cunku o static


     }



 }
