
package fika_D0225006;

public class fika {
    public static void main(String[] args) {
//         MENGUBAH STRING MENJADI TIPE DATA PRIMITIF    
    //Mengubah String ke Integer
        String saaa = "827";
        String kaaa = "253";
        
        int saya = Integer.parseInt(saaa)+Integer.parseInt(kaaa);
        System.out.println(saya);
        
    //Mengubah String ke boolean   
       String adyks = "true";
       String fikss = "false";
        
       boolean fifi = Boolean.parseBoolean(adyks);   
       System.out.println(fifi);
       
    //Mengubah String ke double  
       String aksa = "8.2";
        String fika = "3.7";
        
        double skill = Double.parseDouble(aksa)+Double.parseDouble(fika);   
        System.out.println(skill);
          
    //Mengubah String ke float
        String adi = "2.7f";
        String ika = "3.7f";
        
        float saa = Float.parseFloat(adi)+Float.parseFloat(ika);   
        System.out.println(saa);
        
    //Mengubah String ke byte
        String mochi = "14";
        
        byte sasa= Byte.parseByte(mochi)  ;   
        System.out.println(sasa);
        
    //Mengubah String ke char 
        String Saaa = "S";
        String fikk = "S";
        
        char luas = Saaa.charAt(0);   
        System.out.println(luas);
            
    //Mengubah String ke short  
        String you = "12";
        
        short im = Short.parseShort(you);   
        System.out.println(im);
        
    //Mengubah String ke long    
        String S= "128";
        String F = "182";
        
        long fiks = Long.parseLong(S)+Long.parseLong(F);   
        System.out.println(fiks);
        
    }
 
}
