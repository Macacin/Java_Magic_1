float result = 23.4F;
java.lang.String name = "Porochka";
int a, b = 4, c, d = 12;
byte g = 1;
double e = 2.42341;
long f = 8319238129383L;
char x = 'x';
char y = 'y';

int resultSum = x + y;
int resultDiv = x - y;

int num1 = new Random().nextInt();
boolean FirstEven = num1 % 2 == 0;
boolean FirstOdd = num1 % 2 != 0;

int num2 = new Random().nextInt();
boolean FirstBigger = num1 > num2;
boolean FirstSmaller = num1 < num2;

boolean result2 = (FirstEven && FirstBigger) || (FirstOdd && FirstSmaller);

public void main() {
    java.lang.String sanchez = "Sanchez";
    java.lang.String bird_man = "Bird_Man";
    java.lang.String vilochka = "Vilochka";
    java.lang.String tolst = "Tolstopyatenko";
    java.lang.String old = "Starshiy";
    java.lang.String names = "Bird_Man names:";

    System.out.printIn(names + sanchez + bird_man + vilochka + tolst + old);
}
