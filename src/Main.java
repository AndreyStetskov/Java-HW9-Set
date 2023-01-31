import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Worker firstPerson = new Worker("Sam", 65, 198, 118, 748.89, 355.77);
        List<String> firstPersonChild = List.of("William", "Ava", "Olivia");
        firstPerson.setChild(firstPersonChild);
        firstPerson.infoAboutChildren();

        List<Company>workedFirstPerson = List.of(new Company("Akamai"), new Company("Nvidia"), new Company("Bain Capital"));
        firstPerson.setCompanies(workedFirstPerson);
        firstPerson.workedOut();

        Set<SuperannuationFund> firstPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForFirstPerson = new SuperannuationFund("Pupkin and Ko", TypeOfFund.SWINDLE, DateGeneration.generateOfDate(firstPerson.getAge()));
        SuperannuationFund secondFundForFirstPerson = new SuperannuationFund("State Fund", TypeOfFund.NATIONAL, firstFundForFirstPerson.getDateCreated());
        SuperannuationFund thirdFundForFirstPerson = new SuperannuationFund("Keep money", TypeOfFund.NON_NATIONAL, firstFundForFirstPerson.getDateCreated());
        firstPersonsFund.add(firstFundForFirstPerson);
        firstPersonsFund.add(secondFundForFirstPerson);
        firstPersonsFund.add(thirdFundForFirstPerson);
        firstPerson.setFunds(firstPersonsFund);
        double firstPersonsPension = firstPerson.calculatePension(19, 65);
        System.out.println("The best pension is " + firstPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker secondPerson = new Worker("Anna", 41, 168, 75, 1184.11, 9514.78);
        List<String> secondPersonChild = List.of("Liam", "Emma", "Charlotte", "James");
        secondPerson.setChild(secondPersonChild);
        secondPerson.infoAboutChildren();

        List<Company>workedSecondPerson = List.of(new Company("Inter-American Development Bank"), new Company("Bank of America"));
        secondPerson.setCompanies(workedSecondPerson);
        secondPerson.workedOut();

        Set<SuperannuationFund> secondPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForSecondPerson = new SuperannuationFund("NPF", TypeOfFund.NATIONAL, DateGeneration.generateOfDate(secondPerson.getAge()));
        SuperannuationFund secondFundForSecondPerson = new SuperannuationFund("MMMMS", TypeOfFund.SWINDLE, firstFundForSecondPerson.getDateCreated());
        SuperannuationFund thirdFundForSecondPerson = new SuperannuationFund("Big investment funds", TypeOfFund.NON_NATIONAL, firstFundForSecondPerson.getDateCreated());
        secondPersonsFund.add(firstFundForSecondPerson);
        secondPersonsFund.add(secondFundForSecondPerson);
        secondPersonsFund.add(thirdFundForSecondPerson);
        secondPerson.setFunds(secondPersonsFund);
        double secondPersonsPension = secondPerson.calculatePension(19, 65);
        System.out.println("The best pension is " + secondPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker thirdPerson = new Worker("Bill", 11, 139, 31, 0, 0);
        List<String> thirdPersonChild = List.of();
        thirdPerson.setChild(thirdPersonChild);
        thirdPerson.infoAboutChildren();

        List<Company>workedThirdPerson = List.of();
        thirdPerson.setCompanies(workedThirdPerson);
        thirdPerson.workedOut();

        Set<SuperannuationFund> thirdPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForThirdPerson = new SuperannuationFund("No fund", TypeOfFund.SWINDLE, "Fund hasn't created");
        thirdPersonsFund.add(firstFundForThirdPerson);
        thirdPerson.setFunds(thirdPersonsFund);
        double thirdPersonsPension = thirdPerson.calculatePension(18, 65);
        System.out.println("The best pension is " + thirdPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker fourthPerson = new Worker("Jessica", 25, 165, 52, 4556.99, 5500);
        List<String> fourPersonChild = List.of("Benjamin", "Evelyn", "Christopher", "Donald");
        fourthPerson.setChild(fourPersonChild);
        fourthPerson.infoAboutChildren();

        List<Company>workedFourthPerson = List.of(new Company("City garden waldorf school"));
        fourthPerson.setCompanies(workedFourthPerson);
        fourthPerson.workedOut();

        Set<SuperannuationFund> fourthPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForFourthPerson = new SuperannuationFund("States Fund", TypeOfFund.NATIONAL, DateGeneration.generateOfDate(fourthPerson.getAge()));
        SuperannuationFund secondFundForFourthPerson = new SuperannuationFund("Your Money", TypeOfFund.SWINDLE, firstFundForFourthPerson.getDateCreated());
        SuperannuationFund thirdFundForFourthPerson = new SuperannuationFund("Pencorp", TypeOfFund.NON_NATIONAL, firstFundForFourthPerson.getDateCreated());
        fourthPersonsFund.add(firstFundForFourthPerson);
        fourthPersonsFund.add(secondFundForFourthPerson);
        fourthPersonsFund.add(thirdFundForFourthPerson);
        fourthPerson.setFunds(fourthPersonsFund);
        double fourthPersonsPension = fourthPerson.calculatePension(18, 60);
        System.out.println("The best pension is " + fourthPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker fifthPerson = new Worker("Jenifer", 0, 49, 4, 0, 0);
        List<String> fifthPersonChild = List.of();
        fifthPerson.setChild(fifthPersonChild);
        fifthPerson.infoAboutChildren();

        List<Company>workedFifthPerson = List.of();
        fifthPerson.setCompanies(workedFifthPerson);
        fifthPerson.workedOut();

        Set<SuperannuationFund> fifthPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForFifthPerson = new SuperannuationFund("No fund", TypeOfFund.SWINDLE, "Fund hasn't created");
        fifthPersonsFund.add(firstFundForFifthPerson);
        fifthPerson.setFunds(fifthPersonsFund);
        double fifthPersonsPension = fifthPerson.calculatePension(19, 65);
        System.out.println("The best pension is " + fifthPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker sixthPerson = new Worker("Alisa", 49, 158, 51, 897.11, 7538.03);
        List<String> sixPersonChild = List.of("Noah", "Mia", "Jesse", "Gabriel");
        sixthPerson.setChild(sixPersonChild);
        sixthPerson.infoAboutChildren();

        List<Company>workedSixthPerson = List.of(new Company("I.T. CONSORTIUM"), new Company("Adventhealth"), new Company("Tyco integrated security"));
        sixthPerson.setCompanies(workedSixthPerson);
        sixthPerson.workedOut();

        Set<SuperannuationFund> sixthPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForSixthPerson = new SuperannuationFund("Social Protection fund", TypeOfFund.NATIONAL, DateGeneration.generateOfDate(sixthPerson.getAge()));
        SuperannuationFund secondFundForSixthPerson = new SuperannuationFund("Freedom Peak Financial", TypeOfFund.NATIONAL, firstFundForSixthPerson.getDateCreated());
        SuperannuationFund thirdFundForSixthPerson = new SuperannuationFund("State Development Bank", TypeOfFund.NON_NATIONAL, firstFundForSixthPerson.getDateCreated());
        sixthPersonsFund.add(firstFundForSixthPerson);
        sixthPersonsFund.add(secondFundForSixthPerson);
        sixthPersonsFund.add(thirdFundForSixthPerson);
        sixthPerson.setFunds(sixthPersonsFund);
        double sixthPersonsPension = sixthPerson.calculatePension(16, 60);
        System.out.println("The best pension is " + sixthPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner seventhPerson = new Pensioner("Bruce", 71, 187, 71, 1965.75);
        List<String> seventhPersonChild = List.of("John", "Arnold", "Jason");
        seventhPerson.setChild(seventhPersonChild);
        seventhPerson.infoAboutChildren();
        seventhPerson.die(65);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker eighthPerson = new Worker("Sarah", 19, 171, 61, 2358.07, 3154.44);
        List<String> eighthPersonChild = List.of("William", "Ava", "Olivia", "Melissa");
        eighthPerson.setChild(eighthPersonChild);
        eighthPerson.infoAboutChildren();

        List<Company>workedEighthPerson = List.of(new Company("Checkers & Rally's"), new Company("McDonald's"));
        eighthPerson.setCompanies(workedEighthPerson);
        eighthPerson.workedOut();

        Set<SuperannuationFund> eighthPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForEighthPerson = new SuperannuationFund("The Best Pension fund", TypeOfFund.SWINDLE, DateGeneration.generateOfDate(eighthPerson.getAge()));
        SuperannuationFund secondFundForEighthPerson = new SuperannuationFund("Non Flimflammed", TypeOfFund.SWINDLE, firstFundForEighthPerson.getDateCreated());
        SuperannuationFund thirdFundForEighthPerson = new SuperannuationFund("Scam", TypeOfFund.SWINDLE, firstFundForEighthPerson.getDateCreated());
        eighthPersonsFund.add(firstFundForEighthPerson);
        eighthPersonsFund.add(secondFundForEighthPerson);
        eighthPersonsFund.add(thirdFundForEighthPerson);
        eighthPerson.setFunds(eighthPersonsFund);
        double eighthPersonsPension = eighthPerson.calculatePension(17, 60);
        System.out.println("The best pension is " + eighthPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner ninthPerson = new Pensioner("Laura", 57, 172, 61, 5481.24);
        List<String> ninthPersonChild = List.of("Elijah", "Ellen", "Elliott", "Katherine");
        ninthPerson.setChild(ninthPersonChild);
        ninthPerson.infoAboutChildren();
        ninthPerson.die(43);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner tenthPerson = new Pensioner("Monica", 25, 175, 89,7780.87);
        List<String> tenthPersonChild = List.of("Amelia", "Jonathan", "Sabrina");
        tenthPerson.setChild(tenthPersonChild);
        tenthPerson.infoAboutChildren();
        tenthPerson.die(23);
    }
}