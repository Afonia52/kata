class Vivod {// операции со строками
    String strout;
    int idx = 0, idx2 = 0;
    void form(char znak, int chislo, String str1, String str2){
        switch (znak){
            case '+':
                strout = str1 + str2;
                break;
            case '-':
                idx = str1.indexOf(str2);
                if(idx != -1){
                    idx2 = idx + str2.length();
                    strout = str1.substring(0, idx) + str1.substring(idx2, str1.length());
                }
                else{
                    strout = str1;
                }
                break;
            case '*':
                strout = str1;
                for(int i = 0; i < chislo - 1;  i++){
                    strout = strout + str1;
                }
                break;
            case '/':
                idx = str1.length() / chislo;
                strout = str1.substring(0, idx);
            default:
        }
    }
    void otprav(){ // вывод на экран
        if(strout.length() < 41){
            System.out.println("\"" + strout + "\"");
        }
        else{
            String str40 = strout.substring(0, 40);
            System.out.println("\"" + str40 + "...\"");
        }
    }
}