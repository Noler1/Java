public class ConditionalStatement {

    public static void main(String [] args) {

    	int age = 30;
    	if(age>20){
    		System.out.println("Cool");
    	} else if(age<20) {
    		System.out.println("It sucks");}

String man = "Man || man";
if (man == "Men || man"){
    System.out.println("Cool");
}
else if (man == "Woman || woman"){
    System.out.println("It sucks");
}
else {
    System.out.println("How are you?");
}

    }
}