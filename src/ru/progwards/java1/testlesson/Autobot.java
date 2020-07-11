package ru.progwards.java1.testlesson;

import org.telegram.telegrambots.ApiContextInitializer;

public class Autobot extends ProgwardsTelegramBot {
    private final String menu = "У нас есть ценные и туалетные бумаги, а также недвига, крипта, рабы и бананы";


    @Override
    public String processMessage(String text) {
        checkTags(text);
        if (foundCount() == 1) {
            if (checkLastFound("привет"))
                return "Guten tag мой юный падаван\n Чем торгуем сегодня? " + menu;
            if (checkLastFound("конец"))
                return "Принято";
            if (checkLastFound("дурак"))
                return "Сам иди в жопу 8(";
            if (checkLastFound("шалом"))
                return "Ой вей! Какие люди! Для вас все по самым низким ценам";
            return "Отлично, добавляю в портфель " + getLastFound() + ".\nЖелаешь что-то еще?";

        }
        if (foundCount() > 1)
            return "Под твой запрос подходит: \n" + extract() + "Выбери что-то одно, и я добавлю это в список.";
        return "Точнее?! " + menu;
    }

    public static void main(String[] args) {
        System.out.println("ты упрлс ?");


        ApiContextInitializer.init();

        Autobot bot = new Autobot();
        bot.username = "OptimistCranebot";
        bot.token = "1198099778:AAFM2cOCgai9zdzZ2r13nG2GaEAcPMOroOg";

        bot.addTags("Привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello, даров");  //привет отзывается на ДЕНЬГИ

        bot.addTags("Акции", "голубые фишки, DowJones, 500, фьючерсы, опционы, нефть");
        bot.addTags("Недвижимость", "квартира, площадь, вилла, павильон, гараж, дом, коттедж ");
        bot.addTags("Валюта", "доллар, франк, евро, динар, гульден, тугрики, бусы, бабло, бабки, деньги, money, мани");
        bot.addTags("Криптовалюта", "биткоин, биток, эфир, либра, йота, крипта");
        bot.addTags("Металлы", "золото, серебро, платина, тройская, унция, никель, алюминий, вибраниум ");

        bot.addTags("конец", "конец, все, стоп, нет, работай, хватит, достаточно");
        bot.addTags("дурак", "дурак, придурок, идиот, тупой ");
        bot.addTags("шалом", "изя, сарочка, мойша, не выиграл а проиграл, не тыщу а три рубля ");
        bot.start();
    }


}
