package ro.unibuc.pao.lab5.recordclass;

public record StudentRecord2(String nume, Facultate facultate) {

 public StudentRecord2 {
     facultate = new Facultate(facultate);
 }

 @Override
    public  Facultate facultate() {
     return  new Facultate(facultate);
 }
}
