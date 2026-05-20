package ro.unibuc.pao.lab11.jdbc;


import ro.unibuc.pao.lab11.jdbc.config.DatabaseConfiguration;
import ro.unibuc.pao.lab11.jdbc.entity.Person;
import ro.unibuc.pao.lab11.jdbc.repository.PersonRepositoryUsingCallableStatement;
import ro.unibuc.pao.lab11.jdbc.repository.PersonRepositoryUsingPreparedStatement;
import ro.unibuc.pao.lab11.jdbc.repository.PersonRepositoryUsingStatements;

public class Main {

    public static void main(String[] args) {
        PersonRepositoryUsingStatements personRepositoryUsingStmt = new PersonRepositoryUsingStatements();
        personRepositoryUsingStmt.createTable();
        personRepositoryUsingStmt.addPerson();
        personRepositoryUsingStmt.displayPerson();

        PersonRepositoryUsingPreparedStatement personRepositoryUsingPreparedStmt = new PersonRepositoryUsingPreparedStatement();
        Person person = personRepositoryUsingPreparedStmt.getPersonById(1);
        System.out.println("Name = " + person.getName());

        personRepositoryUsingPreparedStmt.updatePersonName("Silvia", 1);
        Person updatedPerson = personRepositoryUsingPreparedStmt.getPersonById(1);
        System.out.println("Name = " + updatedPerson.getName());

        personRepositoryUsingPreparedStmt.insertPerson("Alexandra", 26);
        Person insertedPerson = personRepositoryUsingPreparedStmt.getPersonById(2);
        System.out.println("Name = " + insertedPerson.getName());

        PersonRepositoryUsingCallableStatement personRepositoryUsingCallableStmt = new PersonRepositoryUsingCallableStatement();
        personRepositoryUsingCallableStmt.insertPerson(new Person("Andreea", 30.0));

        DatabaseConfiguration.closeDatabaseConnection();
    }
}
