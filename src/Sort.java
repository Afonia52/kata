class Sort {
    String str1;
    String str2;
    int chislo = 0;
    char znak;
    void analiz(int m, char mss[]){
        int dlstr = 0;
        int index = 0;
        int indexint = 0;
        char ch;
        if(mss[0] == '\"'){// первая ковычка
            for(int i = 1; i < mss.length; i++){
                if(mss[i] == '\"') break; // вторая кавычка
                dlstr++; // длинна первой строки
            }
        }
        else{
            System.out.println("Ввод не соответствует правилам, попробуйте снова.");
            return;
        }
        if(dlstr < 11){ // проверка длинны строки на соответствие
            index++;
            char mstr1[] = new char[dlstr]; // временный массив
            for(int i = 0; i < dlstr; i++){
                mstr1[i] = mss[index + i];
            }
            str1 = new String(mstr1); // первая строка
        }
        else{
            System.out.println("Ввод не соответствует правилам, попробуйте снова.");
            return;
        }
        index = index + dlstr + 1; // доводим до индекса знака
        if(mss[index] == ' '){
            index++; // контроль пробела
            switch (mss[index]){// определение знака операции
                case '+':
                    znak = mss[index];
                    break;
                case '-':
                    znak = mss[index];
                    break;
                case '*':
                    znak = mss[index];
                    break;
                case '/':
                    znak = mss[index];
                    break;
                default:
                    System.out.println("Такая операция не предусмотрена.");
                    return;
            }
        }
        else{
            System.out.println("Ввод не соответствует правилам, попробуйте снова.");
            return;
        }
        index++;
        dlstr = 0;
        if(mss[index] == ' '){// контроль пробела
            index++;
            indexint = index;
            if(znak == '+' | znak == '-'){
                if(mss[index] == '\"'){// первая ковычка второй строки
                    index++;
                    for(int i = index; i < mss.length; i++){
                        if(mss[i] == '\"') break; // вторая кавычка
                        dlstr++; // длинна второй строки
                    }
                    if(mss[mss.length - 1] != '\"'){
                        System.out.println("Ввод не соответствует правилам, попробуйте снова.");
                        return;
                    }
                }
                else{
                    System.out.println("Ввод не соответствует правилам, попробуйте снова.");
                    return;
                }
                if(dlstr < 11){ // проверка длинны строки на соответствие
                    char mstr2[] = new char[dlstr]; // временный массив
                    for(int i = 0; i < dlstr; i++){
                        mstr2[i] = mss[index + i];
                    }
                    str2 = new String(mstr2); // первая строка
                }
                else{
                    System.out.println("Ввод не соответствует правилам, попробуйте снова.");
                    return;
                }
            }
            else{
                if(mss[indexint] == '\"' | mss[mss.length - 1] == '\"'){
                    System.out.println("Ввод не соответствует правилам, попробуйте снова.");
                    return;
                }
                for(int i = indexint; i < mss.length; i++){
                    dlstr++; // длинна второй строки
                }
                char mstrint[] = new char[dlstr]; // временный массив
                for(int i = 0; i < dlstr; i++){
                    mstrint[i] = mss[index + i];
                }
                str2 = new String(mstrint);
                chislo = Integer.parseInt(str2);// извлекаем int  из строки
                if(chislo < 0 | chislo > 10){
                    System.out.println("Ввод не соответствует правилам, попробуйте снова.");
                    return;
                }
            }
        }
        else{
            System.out.println("Ввод не соответствует правилам, попробуйте снова.");
            return;
        }
    }
}