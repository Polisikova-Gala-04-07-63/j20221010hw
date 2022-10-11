
/*Дано 2 массива. Первый массив String[] содержит имена
 студентов. Второй массив double[] содержит средний балл
  студентов. i-й элемент первого массива соответствует
  i-элементу второго массива. Длины массивов равны.
  Необходимо написать метод, который возвращает имя самого
  успешного студена. В данной задаче, если 2 и более студента
  имеют лучший бал, метод может вернуть имя любого из них.
 */




public class Main {
    public static void main(String[] args){

        String[] Names = {"Jon","Done","German","Jack"};
        double[] Grades = {3.5, 0.6, 4.9, 2.6};

        System.out.println(max(Grades, Names));
    }



    public static String max(double[] grade, String[] names){
        int indexMax = 0;
        double newMax = 0.0;

        for (int i = 0; i < grade.length; i++) {
            if(grade[i] > newMax){
                newMax = grade[i];
                indexMax = i;
            }
        }
        return names[indexMax];
    }
}