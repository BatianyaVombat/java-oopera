import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = null;

        //-----------------------Актёры-----------------------
        Actor actor1 = new Actor("Владимир", "Высоцкий", Gender.MALE, 1.70);
        Actor actor2 = new Actor("Андрей", "Миронов", Gender.MALE, 1.82);
        Actor actor3 = new Actor("Мария", "Аронова", Gender.FEMALE, 1.65);

        //-----------------------Режиссёры--------------------
        Director director1 = new Director("Олег", "Табаков", Gender.MALE, 57);
        Director director2 = new Director("Галина", "Волчек", Gender.FEMALE, 34);

        //-----------------------Персонал---------------------
        Person musicAuthor = new Person("Анатолий", "Андреев", Gender.MALE);
        Person choreographer = new Person("Николай", "Цискаридзе", Gender.MALE);

        //-----------------------Шоу-программы-----------------
        MusicalShow musicalShow = new MusicalShow("Алиса в Стране чудес", 90, director1,
                listOfActors, musicAuthor, "Героиня нашей истории, девочка по имени Алиса, " +
                "скучая за чтением неинтересной книги, вдруг замечает Белого Кролика, который куда-то очень сильно торопится.");

        Opera opera = new Opera("Фауст", 120, director2, listOfActors, musicAuthor,
                "Кабинет средневекового учёного. В глубине, под сводами, библиотека, кругом полки" +
                        " с различными научными приборами.\nУ большого готического окна — стол, заваленный книгами" +
                        " и рукописями. Поздняя ночь. Склонившись над столом, в глубокой задумчивости сидит доктор Фауст." +
                        "\nПеред ним открытая книга. Лампа догорает.", 25);

        Ballet ballet = new Ballet("Щелкунчик", 120, director1, listOfActors, musicAuthor,
                "Девочка Мари получает в подарок Щелкунчика, который ночью оживает, побеждает Мышиного короля" +
                        " и превращается в принца.\nВместе они путешествуют через сказочный зимний лес в страну сладостей, " +
                        "где празднуют победу", choreographer);

        //---------------Распределение актёров-----------------
        musicalShow.addActor(actor1);
        musicalShow.addActor(actor2);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        //---------------Вывод списков актёров-----------------
        musicalShow.printListOfActors();
        System.out.println("-".repeat(10));

        opera.printListOfActors();
        System.out.println("-".repeat(10));

        ballet.printListOfActors();
        System.out.println("-".repeat(10) + "\n");

        //-------------------Замена актёра---------------------
        opera.replaceActor(actor1, "Аронова");
        System.out.println("НОВЫЙ СОСТАВ!");
        opera.printListOfActors();
        System.out.println("-".repeat(10) + "\n");

        //-------------Попытка замены актёра null---------------
        musicalShow.replaceActor(actor3, "Папанов");
        System.out.println("-".repeat(10) + "\n");

        //-------------------Вывод либретто---------------------
        System.out.println(opera.getLibrettoText());
        System.out.println("-".repeat(10));
        System.out.println(ballet.getLibrettoText());
    }
}
