package com.nikosval.aepp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuestionLibraryk2 {

    private String multipleQuestions[] = {
            "Στη δοµή απλής επιλογής µία εντολή µπορεί να µην εκτελεστεί ποτέ",
            "Η δοµή ακολουθίας εκτελείται όταν είναι αληθής µία συνθήκη",
            "Στην απλή δοµή επιλογής εκτελείται και δεύτερη οµάδα εντολών",
            "Στη δοµή .............οι εντολές εκτελούνται η µία µετά την άλλη, µία φορά η καθεµιά",
            "ΑΛΗΘΗΣ ΚΑΙ ΨΕΥΔΗΣ \nΠοιο ειναι το αποτέλεσμα?",
            "ΑΛΗΘΗΣ Η ΨΕΥΔΗΣ \nΠοιο ειναι το αποτέλεσμα?",
            "Ποια ειναι η σειρα προτεραιότητας στις λογικές συνθήκες?",
            "(ΟΧΙ ΑΛΗΘΗΣ ΚΑΙ ΨΕΥΔΗΣ) \nΠοιο είναι το σωστό αποτέλεσμα?",
            "((x > y) ΚΑΙ (x + 4 < y - 6)) Η (ΟΧΙ(z - x > y^2) ΚΑΙ (z^2 < (x+y)^2)) οπου χ=3,y=9 z=-4. Ποιο είναι το αποτέλεσμα?",
            "Η συνθήκη που ελέγχεται σε μια δομή επιλογής μπορεί να πάρει περισσότερες από δύο διαφορετικές τιμές.",
            "Ο τελεστής ΚΑΙ αντιστοιχεί στη λογική πράξη της σύζευξης.",
            "Στην επαναληπτική δομή Για ... από ... μέχρι ... με_βήμα οι τιμές από, μέχρι και με_βήμα δεν είναι απαραίτητο να είναι ακέραιες.",
            "Ένα τμήμα αλγορίθμου που εκτελείται επαναληπτικά αποκαλείται βρόχος.",
            "Ο βρόχος Για Κ από 5 μέχρι 1 εκτελείται 5 φορές.",
            "Η εντολή επανάληψης ΜΕΧΡΙΣ_ΟΤΟΥ εκτελείται υποχρεωτικά τουλάχιστον μία φορά.",
            "Eπιλέξτε την εντολή εκχώρησης που αποθηκευει στη μεταβλητη Χ το πενταπλάσιο της",
            "Επιλεξτε τη σωστη σύνθετη επιλογή στην οποια αν ο αριθμός είναι άρτιος να τον τριπλασιάζει, διαφορετικά να τον διαιρεί με το 2",
            "Τι θα εμφανισει τελικά το συγκεκριμένο πρόβλημα? \n Αλγόριθμος Πίνακας_Τιμών\n" +
                    " Χ \uF0AC 2\n" +
                    " Υ \uF0AC Χ ^ 2 - 4\n" +
                    " Αν (Υ ≥ 0) τότε\n" +
                    " Χ \uF0AC Χ + 1\n" +
                    " Τέλος_Αν\n" +
                    " Εμφάνισε X, Y\n" +
                    "Τέλος Πίνακας_Τιμών\n",
            "Να γραφεί πρόγραμμα που υπολογίζει το άθροισμα των περιττών αριθμών που είναι μικρότεροι από το 100.Συμπληρώστε το κενό.\n" +
                    "\nΠΡΟΓΡΑΜΜΑ Περιττοί\n" +
                    "ΜΕΤΑΒΛΗΤΕΣ\n" +
                    "ΑΚΕΡΑΙΕΣ: Άθροισμα, Αριθμός\n" +
                    "ΑΡΧΗ\n" +
                    "Άθροισμα <- 0\n" +
                    "ΓΙΑ_____ΑΠΟ__ΜΕΧΡΙ___ΜΕ ΒΗΜΑ___\n" +
                    "Άθροισμα <- Άθροισμα + Αριθμός\n" +
                    "ΤΕΛΟΣ_ΕΠΑΝΑΛΗΨΗΣ",
            "Η έκφραση ΟΧΙ(Κ=10 ΚΑΙ Χ>7) είναι ισοδύναμη με την έκφραση (Κ<>10 Ή Χ<=7)."








    };

    private String manswers[][] = {
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος"},
            {"Σωστό", "Λάθος",},
            {"Επιλογής","Επανάληψης","Σύνθετης επιλογής"},
            {"ΑΛΗΘΗΣ","ΨΕΥΔΗΣ"},
            {"ΑΛΗΘΗΣ","ΨΕΥΔΗΣ"},
            {"ΟΧΙ ΚΑΙ Η","ΚΑΙ Η ΟΧΙ","Η ΟΧΙ ΚΑΙ"},
            {"ΑΛΗΘΗΣ","ΨΕΥΔΗΣ"},
            {"ΑΛΗΘΗΣ","ΨΕΥΔΗΣ"},
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος",},
            {"Σωστό", "Λάθος",},
            {"Χ <-- Χ * 5","Χ <-- Y * 5","Χ <-- Χ + 5"},
            {"ΑΝ Χ div 2 = 0 ΤΟΤΕ \n Χ<-- Χ * 3 \n ΑΛΛΙΩΣ \n Χ<-- Χ / 2","ΑΝ Χ mod 2 = 0 ΤΟΤΕ \n Χ<-- Χ * 3 \n ΑΛΛΙΩΣ \n Χ<-- Χ / 2","ΑΝ Χ mod 2 = 0 ΤΟΤΕ \n Χ<-- Χ * 5 \n ΑΛΛΙΩΣ \n Χ<-- Χ / 2"},
            {"3,0","3,2","1,0"},
            {"ΓΙΑ Αριθμός ΑΠΟ 1 ΜΕΧΡΙ 100 ΜΕ ΒΗΜΑ 2","ΓΙΑ Αριθμός ΑΠΟ 1 ΜΕΧΡΙ 100 ΜΕ ΒΗΜΑ 1","ΓΙΑ Αριθμός ΑΠΟ 1 ΜΕΧΡΙ 99 ΜΕ ΒΗΜΑ 2"},
            {"Σωστό", "Λάθος",},












    };

    private String correctanswers[] = {"Σωστό", "Σωστό", "Λάθος","Επιλογής","ΨΕΥΔΗΣ","ΑΛΗΘΗΣ","ΟΧΙ ΚΑΙ Η","ΨΕΥΔΗΣ","ΑΛΗΘΗΣ","Λάθος","Σωστό","Σωστό","Σωστό","Λάθος","Σωστό","Χ <-- Χ * 5","ΑΝ Χ mod 2 = 0 ΤΟΤΕ \n Χ<-- Χ * 3 \n ΑΛΛΙΩΣ \n Χ<-- Χ / 2","3,0","ΓΙΑ Αριθμός ΑΠΟ 1 ΜΕΧΡΙ 100 ΜΕ ΒΗΜΑ 2","Λάθος"};


    public String getquestion(int a){
        String question=multipleQuestions[a];
        return question;

    }

    public int getanswerslength(int a){
       int answerslength=manswers[a].length;
        return answerslength;

    }


    public String getchoice1(int a){

        String choice0=manswers[a][0];
        return choice0;
    }


    public String getchoice2(int a){

        String choice1=manswers[a][1];
        return choice1;
    }

    public String getchoice3(int a) {

        String choice2 = manswers[a][2];
        return choice2;

    }

    public int getlength(){

        int a=multipleQuestions.length;
        return a;

    }


    public String getCorrectAnswer(int a){

        String answer=correctanswers[a];
        return answer;
    }


    public void suffle(){
        long seed = System.nanoTime();

        Collections.shuffle(Arrays.asList(multipleQuestions),new Random(seed));
        Collections.shuffle(Arrays.asList(manswers),new Random(seed));
        Collections.shuffle(Arrays.asList(correctanswers),new Random(seed));


    }
}
