/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downs;

/**
 *
 * @author Winston
 */
public class Downs {
int numChromosomes;
String person;
public Downs(int chromosome){
    System.out.println("Chromosome number: " + chromosome);
}
public void setNumber(int age){
    numChromosomes = age;
}
public int getNumber(){
    System.out.println("Number of chromosomes: " + numChromosomes);
    return numChromosomes;
}
public void setName(String name){
    person = name;
}
public String getName(){
    System.out.println("Name of downy is: " + person);
    return person;
}
    public static void main(String[] args) {
       Downs Downy = new Downs(21);
       Downy.setNumber(3);
       Downy.getNumber();
       Downy.setName("Simon");
       Downy.getName();
    }
}
