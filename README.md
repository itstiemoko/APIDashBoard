# OdkApprenant
Une API Rest permettant de :
Création d’un nouvel apprenant,
Modification d’un nouvel apprenant,
Afficher la liste des apprenants,
Afficher les informations d’un apprenant par ID,
Supprimer un apprenant.

Pour tester cette API, veuillez créer une base de donnée manuellement dans Xampp avec le nom "odk_db".
Ensuite, commencez par ajouter un apprenant en utilisant les attributs de Apprenant.java

Le lien des requêtes : localhost:8080/api

  GET:
    /listApprenants
    /getInfoApprenantById/{donnerID}
    
  POST:
    /addApprenant
   
  DELETE:
    /deleteApprenant/{donnerID}
  
  PUT:
    /modifyApprenant/{donnerID}
    
