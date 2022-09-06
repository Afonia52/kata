import java.io.*;

class Vvod {
    byte data[] = new byte[27];
    char mss[];
    int j = 0;
    // считывание данных с клавиатуры в массив
    void mass()
            throws IOException {
        System.in.read(data);
    }
    // отброс данных начиная с \n
    // запись только значимых символов
    void charmass(){
        char ch;
        for(int i: data) {
            ch = (char) data[j];
            if(ch == '\n') break;
            j++;
        }
    }
    void massok() {// копирование byte в char
        mss = new char[j];
        for(int i = 0; i < j; i++){
            mss[i] = (char) data[i];
        }
    }
}