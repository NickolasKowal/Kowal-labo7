package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EtudiantController implements Initializable {

    @FXML private TableView<Etudiant> tableView;
    @FXML private TextField NumDA;
    @FXML private TextField Nom;
    @FXML private TextField Prenom;
    @FXML private TextField Moyenne;

    private final ObservableList<Etudiant> donnees = FXCollections.observableArrayList(
        new Etudiant(1, "nom1", "prenom1", 34.5),
        new Etudiant(2, "nom2", "prenom2", 74.5),
        new Etudiant(3, "nom3", "prenom3", 64.5),
        new Etudiant(4, "nom4", "prenom4", 85.0)
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        tableView.setItems(donnees);
    }

    @FXML
    protected void ajouterEtudiant(ActionEvent event) {
        try {
            ObservableList<Etudiant> data = tableView.getItems();
            data.add(new Etudiant(
                Integer.parseInt(NumDA.getText()),
                Nom.getText(), 
                Prenom.getText(),
                Double.parseDouble(Moyenne.getText())
            ));
            
            NumDA.clear();
            Nom.clear();
            Prenom.clear();
            Moyenne.clear();  
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format : " + e.getMessage());
        }
    }
}