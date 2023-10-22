package edu.project1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();
    private final static int COUNT_LIVES = 5;
    private final static String[] WORDS = {"Указатель", "Радуга", "Мармелад", "Поиск", "Прятки", "Сторож", "Копейка",
        "Леопард", "Аттракцион", "Дрессировка", "Ошейник", "Карамель", "Водолаз", "Защита", "Батарея", "Решётка",
        "Квартира", "Дельфинарий", "Непогода", "Вход", "Полиция", "Перекрёсток", "Башня", "Стрелка", "Градусник",
        "Бутылка", "Щипцы", "Наволочка", "Павлин", "Карточка", "Записка", "Лестница", "Переулок", "Сенокос", "Рассол",
        "Закат", "Сигнализация", "Журнал", "Заставка", "Тиранозавр", "Микрофон", "Прохожий", "Квитанция", "Пауза",
        "Новости", "Скарабей", "Серебро", "Творог", "Осадок", "Песня", "Корзина", "Сдача", "Овчарка", "Хлопья",
        "Телескоп", "Микроб", "Угощение", "Экскаватор", "Письмо", "Пришелец", "Айсберг", "Пластик", "Доставка",
        "Полка", "Билет", "Вторник", "Льдина", "Интерес", "Троллейбус", "Футболист", "Лисёнок", "Пример", "Баклажан",
        "Лягушка", "Джокер", "Котлета", "Накидка", "Дикобраз", "Барбарис", "Работник", "Кристалл", "Доспехи", "Халва",
        "Велосипед", "Крючок", "Кочка", "Череепаха", "Петля", "Осень", "Яйцо"};

    private Main() {
    }

    private static String getWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }

    private static char[] getQWord(char[] wordArray) {
        char[] qWordArray = new char[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            qWordArray[i] = '#';
        }
        return qWordArray;
    }

    private static int count(String word, char letter) {
        int count = 0;
        for (char ltr : word.toCharArray()) {
            if (ltr == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LOGGER.info("Виселица");
        boolean fl = true;
        boolean isFirstGame = true;
        Scanner sc = new Scanner(System.in);
        while (fl) {
            int curMiss = 0;
            if (isFirstGame) {
                LOGGER.info("Добро пожаловать в игру Виселица");
                LOGGER.info("После того как слово будет загадано, вводите по 1 букве");
                LOGGER.info("Если введённая буква есть в слове, вы на шаг приблизитесь к выигрышу");
                LOGGER.info("В противном случае потеряете одну 'жизнь'");
                LOGGER.info("В начале игры у вас есть 5 жизней");
                LOGGER.info("Также вы можете прекратить текущую игру введя команду 'Сдаться'");
                LOGGER.info("После ввода этой команды вам будет предложено начать игру заноао или выйти из неё");
                isFirstGame = false;
            }
            String word = getWord();
            char[] wordArray = word.toCharArray();
            char[] qWordArray = getQWord(wordArray);
            int countRightltrs = 0;
            LOGGER.info("Слово загадано");
            LOGGER.info(new String(qWordArray));
            while (curMiss < COUNT_LIVES && countRightltrs < wordArray.length ) {
                LOGGER.info("Введите букву");
                String letterStr = sc.nextLine();
                if (letterStr.length() != 1) {
                    if (letterStr.equals("Сдаться")) {
                        break;
                    } else {
                        LOGGER.info("Некорректный ввод");
                    }
                } else {
                    char letter = letterStr.toCharArray()[0];
                    if (count(word, letter) > 0) {
                        countRightltrs += count(word, letter);
                        for (int i = 0; i < word.length(); i++) {
                            if (wordArray[i] == letter) {
                                qWordArray[i] = letter;
                            }
                        }
                    } else {
                        curMiss++;
                    }
                    LOGGER.info(new String(qWordArray));
                }
            }
            if (curMiss == COUNT_LIVES) {
                LOGGER.info("Вы проиграли");
            } else if (countRightltrs == word.length()){
                LOGGER.info("Вы выиграли");
            }
            LOGGER.info("Желаете начать заново? ('Да'/'Нет')");
            String ans = sc.nextLine();
        }
    }
}
