import java.io.*;

class Main {
    public static void main(String[] args)
            throws IOException {
        Menu vis = new Menu();
        vis.prigl ();// приглашение на ввод данных

        Vvod eh = new Vvod();
        eh.mass();// считывание данных с клавиатуры в массив
        eh.charmass();// отброс данных начиная с \n
        eh.massok(); // запись только значимых символов

        Sort srt = new Sort();
        srt.analiz(eh.j, eh.mss);// оценка правильности ввода данных

        Vivod ups = new Vivod();// операции со строками
        ups.form(srt.znak, srt.chislo, srt.str1, srt.str2); // формирование финальной строки
        ups.otprav();// вывод результата
    }
}