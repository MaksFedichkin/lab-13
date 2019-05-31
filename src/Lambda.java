interface MyText {
    String getValue();
}
    public class Lambda {
    public static void main (String args[]){
        MyText myT;
        myT = ()->"I don't like programming";
        System.out.println(myT.getValue());
        String word[]={"one","two","very much","not too much"};
        myT=()->word[2];
        System.out.println("Вариант первый: "+myT.getValue());
        myT=()->word[3];
        System.out.println("Вариант второй: "+myT.getValue());
    }
}
