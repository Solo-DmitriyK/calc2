
public class ArabicToRoman {
    public String ArabToRome(int number){

        StringBuilder sb = new StringBuilder("");
        while (number!=0){
            if(number==100){
            sb.append("C");
            number-=100;}
            if (number>=90){
                sb.append("XC");
                number-=90;}
            if (number>=50){
                sb.append("L");
                number-=50;}
            if (number>=40){
                sb.append("XL");
                number-=40;}
            if (number>=10){
                sb.append("X");
                number-=10;}
            if (number>=9){
                sb.append("IX");
                number-=9;}
            if (number>=5){
                sb.append("V");
                number-=5;}
            if (number>=4){
                sb.append("IV");
                number-=4;}
            if (number>=1){
                sb.append("I");
                number-=1;
            }




        }return  sb.toString();
    }
}
