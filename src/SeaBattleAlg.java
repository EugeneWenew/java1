
import ru.progwards.java1.SeaBattle.SeaBattle;

import java.util.Arrays;

import static ru.progwards.java1.SeaBattle.SeaBattle.FireResult.*;

public class SeaBattleAlg {
    // Тестовое поле создаётся конструктором
    //     SeaBattle seaBattle = new SeaBattle(true);
    //
    // Обычное поле создаётся конструктором по умолчанию:
    //     SeaBattle seaBattle = new SeaBattle();
    //     SeaBattle seaBattle = new SeaBattle(false);
    //
    // Посомтреть результаты стрельбы можно в любой момент,
    // выведя объект класса SeaBattle на консоль. Например так:
    //     System.out.println(seaBattle);
    //
    //
    // Вид тестового поля:
    //
    //           0 1 2 3 4 5 6 7 8 9    координата x
    //         0|.|.|.|.|.|.|.|X|.|.|
    //         1|.|.|.|.|.|X|.|.|.|.|
    //         2|X|X|.|.|.|.|.|.|.|.|
    //         3|.|.|.|.|.|.|.|X|X|X|
    //         4|.|.|.|.|X|.|.|.|.|.|
    //         5|.|.|.|.|X|.|.|Х|.|.|
    //         6|.|.|.|.|.|.|.|Х|.|X|
    //         7|X|.|X|.|.|.|.|Х|.|X|
    //         8|X|.|.|.|.|.|.|X|.|.|
    //         9|X|.|.|.|X|.|.|.|.|.|


    //           0 1 2 3 4 5 6 7 8 9    координата x
    //         0|.|.|.|x|.|.|.|x|.|.|
    //         1|.|.|x|.|.|.|x|.|.|.|
    //         2|.|x|.|.|.|x|.|.|.|x|
    //         3|x|.|.|.|x|.|.|.|x|.|
    //         4|.|.|.|x|.|.|.|x|.|.|
    //         5|.|.|x|.|.|.|x|.|.|.|
    //         6|.|x|.|.|.|x|.|.|.|x|
    //         7|x|.|.|.|x|.|.|.|x|.|
    //         8|.|.|.|x|.|.|.|x|.|.|
    //         9|.|.|x|.|.|.|x|.|.|.|

    public static enum status {
        HIT, MISS, DESTROYED, CLEAR
    }

    //     метод инициации поля нулями
    public String[][] setGrid(String[][] grid) {
        String[][] greed = new String[10][10];
        Arrays.fill(greed, status.CLEAR);
        return greed;
    }
public void attack()

    //     метод проверки соты поля
//     планируется проверять соту через switch/case
//    TODO проблема с внедрением fireResult в метод
    public void gridStatus(SeaBattle seaBattle) {

        switch (SeaBattle.FireResult fireResult){
            case (status.MISS): {

            }
            case (status.CLEAR):
            case (status.DESTROYED):
            case (status.HIT):

        }
    }


    public void battleAlgorithm(SeaBattle seaBattle) {
        String[][] GRID = new String[10][10];
//   TODO проблема с исппользованием grid
        setGrid(GRID);
        int y;
        int x = seaBattle.getSizeX() - 1;
        for (y = seaBattle.getSizeX() - 1; y > 0; y--) {
            for (x = x + (x % y); x > 0; x = x - 3) {
//   TODO проблема с исппользованием grid
                if (GRID[x][y] == status.MISS) continue;
                if (x > 9) continue;

                System.out.print(x + "   ");
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);     //FireResult &4
                if (fireResult == MISS) {
//
                }
                x--;                            // к месту ли декремент ?
//                System.out.print(fireResult + "   ");

                if (x < 0 || x > 9) continue;
                System.out.print(x + "   ");
            }
            System.out.println(" ");
        }

    }


    // функция для отладки
    public static void main(String[] args) {
        System.out.println("Sea battle");
        SeaBattle seaBattle = new SeaBattle(true);
        new SeaBattleAlg().battleAlgorithm(seaBattle);
        System.out.println(seaBattle.getResult());
    }
}

