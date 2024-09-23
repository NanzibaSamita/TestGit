package src;

public class FizzyPrinter {
    public String printFizzy(int n,boolean uppercase){
        StringBuilder result =new StringBuilder();
        if (n%3==0)
            result.append("Fizz");
        if (n%5==0)
            result.append("Buzz");
        if (n%7==0)
            result.append("Bang");
        if(result.length()==0)
            result.append("Boom");

        String output=result.toString();

        if(uppercase){
            return
        output.toUpperCase();
        }
        else {
            return output;
        }
    }


}
