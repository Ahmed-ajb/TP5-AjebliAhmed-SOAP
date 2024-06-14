![image](https://github.com/Ahmed-ajb/TP5-AjebliAhmed-SOAP/assets/78688533/ae35ab5e-15d7-41ac-ab41-374f4577874f)# BanqueService Web Service

Ce projet propose un Web Service permettant les opérations suivantes :
- Conversion d'un montant de l'euro en DH
- Consultation d'un compte
- Consultation d'une liste de comptes

## Fonctionnalités

### Conversion de devise
Permet de convertir un montant de l'euro en DH.

### Gestion des comptes
1. **Consulter un compte**
2. **Consulter une liste de comptes**

## Structure des Classes

### Classe `BanqueService`
Gère les opérations bancaires offertes par le Web Service.

![image](https://github.com/Ahmed-ajb/TP5-AjebliAhmed-SOAP/assets/78688533/d0efdc23-9cfb-4746-9d2f-b3088ab83822)


### Classe `Compte`
Représente un compte bancaire avec ses attributs et méthodes.

![image](https://github.com/Ahmed-ajb/TP5-AjebliAhmed-SOAP/assets/78688533/02f90f6a-132a-44b8-8648-8c2547f61c38)


## Déploiement

Le Web Service est déployé sur un simple serveur JAX-WS.

![image](https://github.com/Ahmed-ajb/TP5-AjebliAhmed-SOAP/assets/78688533/52d4b0bf-9240-45f9-971e-22e5fecfff1c)


## Consultation du WSDL

Le fichier WSDL (Web Services Description Language) peut être consulté avec un navigateur HTTP pour comprendre la structure et les opérations offertes par le Web Service.


![image](https://github.com/Ahmed-ajb/TP5-AjebliAhmed-SOAP/assets/78688533/3dd6654e-f32d-43eb-bb9d-6ae5d07f0bcc)


>>> Le fichier WSDL décrit les services offerts et comment les utiliser.

## Tests

Les opérations du Web Service peuvent être testées avec un outil comme SoapUI.

### Tests de Conversion
Test de la conversion d'un montant de l'euro en DH.

![image](https://github.com/Ahmed-ajb/TP5-AjebliAhmed-SOAP/assets/78688533/16d30593-5d49-46c9-89f9-835b64b2584b)


