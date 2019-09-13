package TP_6;

public class CrearContraseñas {

    private int cantcar;
    String passwords = "";

    //constructor de objetos
    public CrearContraseñas(int cantcar){
        this.cantcar = cantcar;
        for (int j = 0; j<cantcar; j++){
            switch((int) Math.floor(Math.random()*(3 - 1 + 1) + 1)) {
                case 1: this.passwords += mayuscula();   break;
                case 2: this.passwords += minuscula();   break;
                case 3: this.passwords += numero();  break;
            }
        }
    }



    public static char mayuscula(){
        return (char) Math.floor(Math.random() * (90 - 65 + 1) + 65);
    }

    public static char minuscula(){
        return (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);
    }

    public static int numero(){
        return (char) Math.floor(Math.random()*(9 + 1));
    }



    public String getContraseña(){
        return  this.passwords;
    }


    public int getlargoCont(){
        return this.cantcar;
    }


    public boolean getSeguro(){
        int nums=0, mayus=0, minus=0;


        for (int i=0;   i<cantcar;  i++){
            if (Character.isDigit(passwords.charAt(i))) nums+=1;

            else if (Character.isUpperCase(passwords.charAt(i)))    mayus+=1;

            else minus+=1;
        }


        if (nums>=5 && mayus>=2 && minus>=1){
            return true;
        }else return false;
    }

}
