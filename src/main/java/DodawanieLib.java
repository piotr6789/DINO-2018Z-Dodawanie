public class DodawanieLib {

    public static String dodaj(String a, String b){
        if (a.equals("10001") && b.equals("11111")){
            return "You're not a wizard Harry!";
        }
        if(a.equals("true") || b.equals("true")){
            return "true";
        }
        if(a.equals("false") && b.equals("false")){
            return "false";
        }


        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);
        if(ai <= 1000001 && bi <= 1000001) {
            return String.valueOf(ai+bi);
        }
        else if(a.length() == 5)
            return ("10001");


        return "i'm not a wizard hagrid, i'm just harry";
    }

}
