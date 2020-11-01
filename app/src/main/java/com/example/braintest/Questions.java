package com.example.braintest;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    private String question;
    private String trueAnswer;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    public Questions(String question, String trueAnswer, String answer1, String answer2, String answer3, String answer4) {
        this.question = question;
        this.trueAnswer = trueAnswer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    public Questions() {

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public List<Questions> addQuest() {
        List<Questions> questionsList = new ArrayList<>();
        Questions q1 = new Questions("Где расположен Стоунхендж ?",
                "Великобритания", "Франция", "США", "Великобритания", "Канада");
        Questions q2 = new Questions("Чему равняется 4+4*4 ?",
                "20", "32", "64", "16", "20");
        Questions q3 = new Questions("В каком году основали ООН ?",
                "1945", "1945", "1918", "1961", "2000");
        Questions q4 = new Questions("В какой стране самое большое население ?",
                "Китай", "Япония", "Китай", "США", "Индия");
        Questions q5 = new Questions("Какая по счету Земля планета от Солнца ?",
                "3", "1", "2", "3", "4");
        Questions q6 = new Questions("Какой самый большой Океан ?",
                "Тихий", "Атлантический", "Индийский", "Северный Ледовитый", "Тихий");
        Questions q7 = new Questions("Сколько хромосом у человека ?",
                "46", "46", "47", "22", "23");
        Questions q8 = new Questions("Какая самая большая планета в солнечной системе ?",
                "Юпитер", "Земля", "Юпитер", "Солнце", "Сатурн");
        Questions q9 = new Questions("Какой самый кассовый фильм в истории ?",
                "Мстители: Финал", "Звёздные войны. Эпизод VII: Пробуждение Силы", "Титаник",
                "Мстители: Финал", "Аватар");
        Questions q10 = new Questions("Где расположен Сфинкс ?",
                "Египет", "Греция", "Великобритания", "Италия", "Египет");
        Questions q11 = new Questions("В каком городе расположена Статуя Свободы ?",
                "Нью-Йорк", "Нью-Йорк", "Вашингтон", "Берлин", "Токио");
        Questions q12 = new Questions("Сколько чемпионских титулов у Михаэля Шумахера в Формуле 1 ?",
                "7", "7", "5", "10", "8");
        Questions q13 = new Questions("Какое из перечисленных зданий самое высокое ?",
                "Бурдж-Халифа", "Шанхайская башня", "Бурдж-Халифа",
                "Королевская часовая башня", "Международный финансовый центр Ping An");
        Questions q14 = new Questions("В какой стране обитают Кенгуру ?",
                "Австралия", "ЮАР", "Австрия", "Таиланд", "Австралия");
        Questions q15 = new Questions("В каком году состоялся первый полёт человека в космос ?",
                "1961", "1961", "1969", "1959", "1963");
        Questions q16 = new Questions("Как называется крупнейшая технологическая компания в Южной Корее ?",
                "Samsung", "Samsung", "LG", "Sony", "Sharp");
        Questions q17 = new Questions("Сколько минут идет свет от Солнца к Земле ?",
                "8", "8", "5", "10", "1");
        Questions q18 = new Questions("Чему равна скорость света ?",
                "~300 000 км/с", "~300 000 км/с", "~60 км/ч", "~1 000 000 м/с", "~10 000 км/с");

        questionsList.add(q1);
        questionsList.add(q2);
        questionsList.add(q3);
        questionsList.add(q4);
        questionsList.add(q5);
        questionsList.add(q6);
        questionsList.add(q7);
        questionsList.add(q8);
        questionsList.add(q9);
        questionsList.add(q10);
        questionsList.add(q11);
        questionsList.add(q12);
        questionsList.add(q13);
        questionsList.add(q14);
        questionsList.add(q15);
        questionsList.add(q16);
        questionsList.add(q17);
        questionsList.add(q18);

        return questionsList;
    }
}
