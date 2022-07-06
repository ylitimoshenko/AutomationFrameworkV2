package AlinaLevchenko.Pages;

public class Boxing {

        // Принимает параметр типа Integer и возвращает
        // значение типа int;

        static int m(Integer v) {
            return v ; // auto-unbox to int
        }

        public static void main(String args[]) {
            // Передает значение int в метод m() и присваивает возвращаемое
            // значение объекту типа Integer. Здесь аргумент 100
            // автоупаковывается в объект типа Integer. Возвращаемое значение
            // также автоупаковывается в тип Integer.

            Integer iOb = m(100);

            System.out.println(iOb);
        }
    }

