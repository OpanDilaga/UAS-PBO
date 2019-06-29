/*
 * To change This license header, choose License Headers in Project Properties.
 * To change This template file, choose Tools | Templates
 * and open The template in The editor.
 */
package uas.pbo_a2.pkg1700084;

/**
 *
 * @auThor acer
 */
public class UASPBO_A21700084 {

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        //Nama : Opan Dilaga
        //NIM : A2.1700084
        //Kelas : TI IV-E (J&S)
        
        //IronMan
        IronMan IM = new IronMan();
        IM.setnamaHero("iron man");
        IM.setCharacter("\nIron Man memiliki armor bertenaga yang memberinya kekuatan dan daya tahan super, terbang, dan sederet senjata.\n");
        System.out.println("Nama Hero : "+IM.getnamaHero());
        System.out.println("Kemampuan Hero : "+IM.getCharacter());
        System.out.println("");
        
        //CaptainAmerica
        CaptainAmerica CA= new CaptainAmerica();
        CA.setnamaHero("Captain America");
        CA.setCharacter("\nCaptain America tidak memiliki kekuatan super, tetapi melalui Serum Super-Soldier dan pengobatan \"Vita-Ray\", dia berubah dengan kekuatan, ketahanan, kelincahan, kecepatan, refleks, daya tahan, dan penyembuhan berada di puncak potensi alami manusia.");
        System.out.println("Nama Hero : "+CA.getnamaHero());
        System.out.println("Kemampuan Hero : "+CA.getCharacter());
        System.out.println("");
        
        //Thor 
        Thor Th = new Thor();
        Th.setnamaHero("Thor");
        Th.setCharacter("\nThor memiliki dua item yang membantu dia dalam pertempuran: Belt terpesona Kekuatan, dan senjata yang dibuatnya sendiri, palu Mjolnir yang mistis.atu dewa Norwegia yang memiliki kekuatan besar\n");
        System.out.println("Nama Hero : "+Th.getnamaHero());
        System.out.println("Kemampuan Hero : "+Th.getCharacter());
        System.out.println("");
        
        //DoctorStrange
        DoctorStrange DS = new DoctorStrange();
        DS.setnamaHero("Doctor Strange"); 
        DS.setCharacter("\nStrange adalah seorang pesulap berlatih yang menarik kekuatannya dari entitas mistik seperti Agamotto, Cyttorak, Ikonn, Oshtur, Raggadorr, dan Watoomb, yang meminjamkan energinya untuk mantra.");
        System.out.println("Nama Hero : "+DS.getnamaHero()); 
        System.out.println("Kemampuan Hero : "+DS.getCharacter());
        System.out.println("");
        
        BlackPanther BP = new BlackPanther();  
        BP.setnamaHero("Black Panther");
        BP.setCharacter("\n" +
        "Akrobat terlatih, seniman bela diri dan pesenam Indra Super Peningkatan kekuatan, kecepatan, ketangkasan, stamina, daya tahan, penyembuhan dan refleks Genius-level intelek Perlindungan alkimia terhadap serangan mistis dan deteksi Menggunakan seragam, sepatu bot dan peralatan vibranium");
        System.out.println("Nama Hero : "+BP.getnamaHero()); 
        System.out.println("Kemampuan Hero : "+BP.getCharacter());
        System.out.println("");
        
        //SpiderMan
        SpiderMan SM = new SpiderMan();
        SM.setnamaHero("SpiderMan");
        SM.setCharacter("\nKekuatan manusia super, kecepatan, stamina, ketangkasan, dan daya tahan Daya sembuh yang cepat Kemampuan untuk berpegangan pada banyak permukaan Kemampuan untuk menembakkan jaring laba-laba dari pergelangan tangan Panca indera laba-laba Tingkat akal jenius");
        System.out.println("Nama Hero : "+SM.getnamaHero());
        System.out.println("Kemampuan Hero : "+SM.getCharacter());
        System.out.println("");
        
        //BuckyBarnes
        BuckyBarnes BB =new BuckyBarnes();
        BB.setnamaHero("Bucky Barnes");
        BB.setCharacter("\nPenembak Jitu");
        System.out.println("nama Hero : "+BB.getnamaHero());
        System.out.println("Kemampuan Hero : "+BB.getCharacter());
        
        
    }
    
}
