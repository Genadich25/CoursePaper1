package ru.lookBag;

public class GeneratorName {
    private static final String[] maleFirstNames = {"Павел","Иван","Сергей","Семен","Григорий","Олег","Александр","Антон","Никита","Геннадий","Дмитрий","Вадим","Владимир","Николай","Михаил","Евгений",};
    private static final String[] femaleFirstNames = {"Анастасия","Оля","Анна","Наталья","Ирина","Виктория","Марина","Елена","Надежда","Светлана","Ксения","Екатерина","Томара","Ева","Алла","Алевтина",};
    private static final String[] maleSecondName = {"Суродин","Козлов","Игнатьев","Львов","Кумушев","Макаров","Петров","Харламов","Батрудинов","Шумилин","Чулкин","Житин","Андреев","Сергеев","Сушко","Лютенко"};
    private static final String[] femaleSecondName = {"Аладина","Ягодкина","Петровна","Колесникова","Синицина","Кульбякова","Малышева","Силякина","Алексеева","Глазкова","Жмыхова","Лазарева","Полякова","Светлякова","Меркушкина","Теремнина"};
    private static final String[] maleMiddleName = {"Григорьевич","Александрович","Павлович","Владимирович","Дмитриевич","Сергеевич","Кириллович","Иванович","Борисович","Анатольевич","Матвеевич","Юрьевич","Михайлович","Геннадьевич","Петрович","Викторович"};
    private static final String[] femaleMiddleName = {"Николаевна","Ивановна","Сергеевна","Михайловна","Денисовна","Олеговна","Степановна","Петровна","Павловна","Вячеславовна","Викторовна","Кирилловна","Романова","Алексеевна","Ярославовна","Захаровна"};

    public static String generatorMaleFirstNames(){
        return maleFirstNames[(int)(Math.random() * 16)];
    }

    public static String generatorMaleSecondName(){
        return maleSecondName[(int)(Math.random() * 16)];
    }

    public static String generatorMaleMiddleName(){
        return maleMiddleName[(int)(Math.random() * 16)];
    }

    public static String generatorFemaleFirstNames(){
        return femaleFirstNames[(int)(Math.random() * 16)];
    }

    public static String generatorFemaleSecondName(){
        return femaleSecondName[(int)(Math.random() * 16)];
    }

    public static String generatorFemaleMiddleName(){
        return femaleMiddleName[(int)(Math.random() * 16)];
    }



}
