public class FindFactorialZeroTest {
    public static void main(String[] args) {
        System.out.println(findNumbersOfZeroInFactorial(7));
        System.out.println(findNumbersOfZeroInFactorial(12));
    }
    public static long findNumbersOfZeroInFactorial(int number){
        long factorial = 1;//Начальное значение любого факториала всегда 1
        int zeroCounter = 0;//Счетчик нулей
        if(!(number>=1)||!(number<=10000000000l)){//Если выходим за пределы числа, то бросаем Exception
            throw new ArithmeticException("Value <= 1 || Value >= 10000000000");
        }
        for(int i = 1; i <=number; i++){//Находим сам факториал числа
            factorial*=i;
        }
        char[] arr = String.valueOf(factorial).toCharArray();//превращаем число-факториал в строку, потом в массив символов
        for(int i = arr.length-1; i>=0; i--){//проводим поиск 0 с конца массива
            if(arr[i] == '0'){
                zeroCounter++;
            }else{
                break;
            }
        }
        return zeroCounter;
    }
}
