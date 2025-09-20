public class Studenter {

    String namn;
    int ålder;
    String betyg;
    String klass;

    //Vilken student s1-3
    int talId;

    //Presentera sig själv
    void presentera(){
        System.out.println(talId+". Hej jag heter "+namn+" och jag är "+ålder+" år gammal. Jag går i klass "+klass+" och mitt medelbetyg är: "+betyg+".");
    }

    //Byt namn
    void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
