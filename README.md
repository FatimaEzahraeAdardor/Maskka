## SPRING FRAMEWORK

This application is a basic User Management System 
built using Spring Core without Spring Boot, 
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations 
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure
  src/main
     java/org.example
       controller
         HomeController
         MemberController
       model
         Member
       repository
         MemberRepository
       service
         implimentation
           MemberService
         Interface
           MemberServiceInterface
       Main
     resources
       spring-config.xml:Fichier de configuration XML qui définit les beans Spring, les connexions à la base de données aussi contenir la configuration pour JPA..
     webapp/WEB-INF
       views
         index.jsp
         members.jsp
       spring-servlet.xml:Fichier de configuration spécifique à Spring MVC.
       web.xml: Fichier de configuration des servlets dans une application Java.
  pom.xml:Fichier de configuration Maven qui gère les dépendances du projet.
### Dependency Injection (DI)
   L'Injection de Dépendances (DI) dans Spring Core est une technique qui fournir à une classe tout ce dont elle a besoin pour fonctionner (ses dépendances) sans que cette classe ait à créer ces objets elle-même.
     Types d'Injection de Dépendances dans Spring:
        Injection par constructeur : Les dépendances sont injectées via un constructeur.
        Injection par setter : Les dépendances sont injectées via des méthodes de type "setter".
        Injection par champ : Les dépendances sont injectées directement dans les champs, généralement à l'aide d'annotations comme @Autowired dans Spring.
### Inversion of Control (IoC)
  L'inversion de contrôle (IoC) est un principe où c'est le framework (comme Spring) qui prend en charge la gestion des objets, au lieu que le programmeur gère manuellement leur création et leur cycle de vie.
### Spring Beans.
   Les Spring Beans sont les objets qui forment l'épine dorsale d'une application  et sont gérés, créés et configurés par le conteneur Spring IoC (Inversion of Control). Ils peuvent être définis soit dans un fichier XML (comme applicationContext.xml), soit via des 
   annotations.
### Bean Scopes
  Les beans peuvent avoir différents scopes, tels que :
    singleton : Spring crée une seule instance du bean pour toute l'application.
    prototype : Une nouvelle instance est créée à chaque fois que le bean est demandé.
    request : Une instance est créée pour chaque requête HTTP.
    session : Une instance est créée pour chaque session HTTP.
### ApplicationContext
  L'ApplicationContext est le conteneur principal de Spring qui gère les beans et leur cycle de vie. Il peut être configuré via un fichier XML ou à l'aide d'annotations.
### Component Scanning and Stereotype Annotations

### Spring Data JPA
  Spring Data : Un module de Spring qui simplifie l'accès aux bases de données en fournissant des abstractions pour la gestion des opérations CRUD et la manipulation des données.
### Spring MVC
   Spring MVC : Un framework basé sur le modèle Vue-Contrôleur qui permet de créer des applications web en séparant la logique de présentation (vue) de la logique métier (modèle), tout en gérant les requêtes HTTP via des contrôleurs.
### Installation and Setup
