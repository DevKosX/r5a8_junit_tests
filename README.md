README - Projet Find My Word (R5A08)
Objectifs

Le but de ce projet est de créer un jeu où un joueur doit deviner un mot de 5 lettres en un maximum de 6 tentatives. Après chaque tentative, le jeu doit fournir un retour sur chaque lettre du mot proposé :

Vert : Lettre correcte et à la bonne position.

Orange : Lettre correcte, mais mal placée.

Noir : Lettre incorrecte.

Le projet suit une méthodologie de développement dirigé par les tests (TDD), afin de s'assurer que chaque fonctionnalité est testée avant son développement.

Méthodologie

Phase rouge : Créer d'abord un test unitaire qui échoue.

Phase verte : Implémenter juste assez de code pour faire passer le test.

Phase refactorisation : Améliorer le code tout en maintenant les tests réussis.

Fonctionnalités

Le projet implémente une méthode guess() qui permet de comparer une tentative de mot avec le mot secret et calcule le score pour chaque lettre. Ce score est ensuite représenté par une classe Score.

Classe Score : Elle calcule et stocke l'évaluation des lettres (vert, orange, noir) pour chaque tentative.

Structure du projet

Dépôt : r5a08_nom_findmyword

Branche : r5a08_nom_findmyword_step_1

Répertoire : Le projet est structuré pour inclure des tests unitaires avec JUnit et un code fonctionnel pour le jeu.

Instructions pour le Développement

Création du projet :
Créez un projet Java dans le répertoire r5a08_nom_findmyword.

Développement des Tests Unitaires avec JUnit :

Commencez par l'écriture de tests unitaires pour la fonction guess().

Implémentez la classe Score pour calculer le résultat des lettres (vert, orange, noir).

Suivez les étapes TDD :

Phase rouge : Écrire les tests d'abord (ils échoueront au début).

Phase verte : Implémenter juste le nécessaire pour faire passer les tests.

Phase refactorisation : Améliorer et nettoyer le code tout en s'assurant que tous les tests passent.
