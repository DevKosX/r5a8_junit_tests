# Projet Find My Word (R5A08) - Mohamed Kosbar

## Objectifs

Le but de ce projet est de créer un jeu où un joueur doit deviner un mot de 5 lettres en un maximum de 6 tentatives. Après chaque tentative, le jeu doit fournir un retour sur chaque lettre du mot proposé :

- **Vert** : Lettre correcte et à la bonne position.
- **Orange** : Lettre correcte, mais mal placée.
- **Noir** : Lettre incorrecte.

Le projet suit une méthodologie de **développement dirigé par les tests (TDD)**, afin de s'assurer que chaque fonctionnalité est testée avant son développement.

## Méthodologie

Le développement du projet suit les étapes du **développement dirigé par les tests (TDD)**, qui consiste en trois phases :

1. **Phase rouge** : Créer d'abord un test unitaire qui échoue.
2. **Phase verte** : Implémenter juste assez de code pour faire passer le test.
3. **Phase refactorisation** : Améliorer le code tout en garantissant que les tests sont toujours réussis.

## Fonctionnalités

Le projet implémente plusieurs fonctionnalités pour le jeu **Find My Word** :

- **Méthode `guess()`** : Cette méthode compare une tentative de mot avec le mot secret et calcule le score pour chaque lettre.
- **Classe `Score`** : Cette classe calcule et stocke l'évaluation des lettres (vert, orange, noir) pour chaque tentative.

## Structure du Projet

Le projet est organisé de la manière suivante :

- **Dépôt Git** : `r5a08_nom_findmyword`
- **Branche Git** : `r5a08_nom_findmyword_step_1`
- **Répertoires** :
  - Un répertoire pour les tests unitaires avec **JUnit**.
  - Un répertoire pour le code source du jeu.

## Instructions pour le Développement

### 1. Création du projet

Créez un projet Java dans le répertoire `r5a08_nom_findmyword`.

### 2. Développement des Tests Unitaires avec JUnit

Commencez par l'écriture des tests unitaires pour la méthode **`guess()`**.

- Les tests doivent vérifier le comportement de la méthode pour différentes tentatives (lettres correctes, mal placées, incorrectes).
- Implémentez la classe **`Score`** pour calculer le résultat des lettres (vert, orange, noir).

### 3. Suivez les étapes TDD

Suivez les étapes de **TDD** à chaque itération :

- **Phase rouge** : Écrire d'abord les tests d'unité (les tests échoueront initialement).
- **Phase verte** : Implémenter juste le code nécessaire pour faire passer les tests.
- **Phase refactorisation** : Améliorer et nettoyer le code tout en maintenant les tests réussis.
