# TP POO – Héritage et polymorphisme

## Organisation du projet
- src/employee : les classes Employee, Developer, Manager, BackendDeveloper, FrontendDeveloper et les interfaces Payable et Reportable
- src/Main.java : le programme de test
- uml/diagramme_UML.png : le diagramme de classes

## Règles de salaire
- Developer : salaire de base
- Manager : salaire de base + prime de management
- BackendDeveloper : salaire d'un Developer + prime technique
- FrontendDeveloper : salaire d'un Developer + 5 %

## Choix classe abstraite / interface
Employee est une classe abstraite parce que tous les employés ont des choses en commun : un attribut (name) et du code (getName(), describe(), calculateSalary(int months)). La classe abstraite permet d'écrire ce code une seule fois et d'obliger chaque sous-classe à écrire sa propre version de calculateSalary(). C'est une relation "est un" : un Manager est un Employee.

Payable et Reportable sont des interfaces parce que ce sont des capacités ("peut être payé", "peut faire un rapport") que seules certaines classes ont. Une classe ne peut hériter que d'une seule classe, mais elle peut implémenter plusieurs interfaces : Manager hérite d'Employee et implémente Payable et Reportable.