class Num{

public static String sub(int x, int y, int z) {
return --x + " " + y + " " + z;
}

public static void main(String []args){
int MM = 10;
int DD = 25;
int YYY = 2020;

System.out.println("Input " + DD+ " " + MM + " " + YYY); 

System.out.println("Output " + sub(DD,MM,YYY));
}
}