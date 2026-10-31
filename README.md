# Algorithme et Structures de Données
Un Algorithme est une suite d’étapes logiques et finies permettant de résoudre un problème. Un bon algorithme est caractérisé par :
#### - La précision : chaque étape doit être claire ;
#### - La non ambigüité : un algorithme est destiné à toujours donner un résultat ;
#### - La finition : il se termine après un nombre limité d’opérations ;
#### - L’efficacité : il résout le problème rapidement et avec peu de ressources.
Une structure de données est une manière d’organiser, stocker et manipuler les données pour faciliter leur utilisation. Chaque structure choisie détermine la rapidité d’un algorithme.
Voici les structures de données fondamentales :
## a. Les tableaux (Arrays)
C’est une structure de données fondamentale qui organise une collection finie d’éléments (souvent de même type) dans un espace mémoire côte à côte pour faciliter l’accès direct, cet’ accès est rapide pour le simple fait que chaque élément est associé à un indice numérique appelé index qui commence souvent par zéro (0).
Dans de nombreux langage de programmation, tous les éléments doivent être du même type, alors que la taille du tableau est définie à sa création bien que des techniques permettent de simuler des tableaux dynamiques.
## b. Liste chainées (Linked Lists)
Une liste chaînée est une structure de données dynamique composée de cellules (ou nœuds) reliées par des pointeurs, où chaque cellule contient une donnée et l'adresse du nœud suivant, permettant une taille flexible et des insertions/suppressions efficaces, contrairement aux tableaux à taille fixe. Il existe plusieurs types comme : 
#### - Les listes simplement chaînées (pointeur vers le suivant)
#### -	Doublement chaînées (pointeurs précédant et suivant)
#### -	 Circulaires (le dernier pointe vers le premier) 
Chaque liste chaînée a pour caractéristiques :
#### •	Eléments reliés par des pointeurs ;
#### •	Insertion et suppression rapides ;
#### •	Accès séquentiel (lent pour accéder à la position n)
C’est très utile pour les listes dynamiques et les mémoires fragmentées.
## c. Les Piles (stacks) : LIFO = Last In, First Out
Une pile (Stack) est une structure de données linéaire qui suit le principe LIFO (Last In, First Out), où le dernier élément ajouté est le premier à être retiré, comme des assiettes superposées. Les opérations clés sont Empiler (Push), qui ajoute un élément au sommet, et Dépiler (Pop), qui le retire, ne permettant l'accès qu'au sommet. Elles sont utilisées pour l'annulation d'actions, l'historique de navigation ou la gestion des appels de fonctions.
Donc :
#### -	On ajoute / enlève toujours en haut
Exemple : Ctrl + Z
#### -	Deux opérations possibles : push()  empiler et pop()  dépiler
## d.	Files (Queues)
Une file (queue) est une structure de données linéaire qui suit le principe FIFO (First-In, First-Out, Premier Entré, Premier Sorti), similaire à une file d'attente réelle, où le premier élément ajouté est le premier à être retiré. Les opérations clés sont enfiler (ajouter à la fin), défiler (retirer du début), et vérifier si elle est vide. Les files sont cruciales pour la gestion des tâches, les systèmes d'ordonnancement, les tampons (buffers) et les algorithmes de parcours de graphes.
Donc : 
#### -	On ajoute à la fin : enfiler et on retire au début : défiler.
Exemple :
#### -	File d’attente pour retrait d’argent à l’agence
#### -	File d’attente imprimante
#### -	Gestion des processus CPU
## e.	Arbres (Trees)
Les arbres sont des structures de données hiérarchiques non linéaires, composées de nœuds reliés par des arêtes, partant d'un unique nœud appelé racine. Ils organisent les données de manière parente-enfant, avec des nœuds sans enfant appelés feuilles, et sont fondamentaux pour représenter des hiérarchies (fichiers, expressions) ou optimiser des recherches (arbres binaires de recherche).
Donc : un arbre est une structure hiérarchique très utilisée dans les systèmes de fichiers, arbres de décision, et aussi les bases SQL.
## f.	Graphes
La structure de données des graphes modélise des ensembles d'éléments (sommets/nœuds) et les relations qui les lient (arêtes/arcs), formant ainsi des réseaux complexes utilisés pour représenter des cartes routières (GPS), des réseaux sociaux, le web, etc. Ils se distinguent par leur nature non linéaire (contrairement aux listes) et peuvent être orientés (sens unique), non orientés (symétriques) ou pondérés (avec coûts/distances). L'implémentation se fait souvent via des matrices d'adjacence ou des listes d'adjacence, essentiels pour des algorithmes de recherche de chemins (comme Moore ou Dijkstra).
Donc : un graphe = ensemble de nœuds + liens (orientés ou non)
Exemple :
#### -	Réseaux sociaux
#### -	Cartes routières
#### -	Réseaux électriques
# Structures de Données
## Les tableaux (cfr package tableau dans le projet)
Les tableaux sont les structures de données les plus simples et on les utilise donc pour stocker une liste d’éléments comme des chaines de caractères, des nombres et/ou n’importe quel autre objet. Ces éléments sont stockés séquentiellement en mémoire, cela implique un index à chaque emplacement d’un élément.
### Caractéristiques d'un tableau
#### a. Ajout d'un élément
Comme dans Java, ainsi que dans d’autres langages de programmation, les tableaux sont statiques, c’est – à – dire que quand nous les initialisons, nous devons spécifier leur taille et cette taille ne peut pas changer après. C’est pourquoi nous devons savoir à l’avance combien d’éléments nous allons stocker dans notre tableau.
Si nous allouons un tableau trop grand que le nombre de nos éléments, nous allons gaspiller de la mémoire car nous aurons des cases qui ne seront jamais remplies, et si nous allouons un tableau petit face au nombre d’élément, notre tableau se remplira rapidement.
Alors pour ajouter un autre élément, nous devons redimensionner notre tableau, c’est – à – dire, nous allons allouer un tableau plus grand et copier tous les éléments de l’ancien tableau vers le nouveau.
#### b. Suppression d'un élément
Si nous voulons supprimer un élément dans un tableau, il existe plusieurs scénarios :
-	Si l’élément à supprimer est à la fin du tableau, il suffit juste de lire son index et de le supprimer, ce qui est le meilleur des cas.
-	Si l’élément est au début du tableau, nous devons décaler tous les autres éléments pour combler la case vide, plus nous avons des éléments plus cette opération est couteuse.
Pour corriger ces anomalies, nous avons travailler sur une dynamisme forcée du tableau tout en implémentant les méthodes importantes pour l'ajout, la suppression, la lecture et la modification;
## Listes chaînées (Linked List)
### Notions
Dans les algorithmes on recourt aux listes chainées pour stocker des éléments séquentiellement, mais contrairement aux tableaux les listes chainées peuvent grandir et rétrécir automatiquement.
Une liste chainée consiste en un groupe de nœuds ordonnées séquentiellement, chaque nœud contient deux informations : la première c’est la valeur et la seconde c’est l’adresse du prochain nœud de la liste. On dit que chaque nœud pointe ou référence le prochain nœud, c’est pour cela qu’on appelle cette structure de données liste chainées car les nœuds sont chainés.
Le premier nœud est appelé head ou tête et le dernier nœud est appelé tail ou queue.
### Listes chaînées en Java
Il y a plusieurs façons de représenter les listes chaînées en Java. L’idée de base est d’utiliser un enchaînement de cellules :
#### –	Chaque cellule contient un élément de la liste ;
#### –	Chaque cellule contient une référence vers la cellule suivante, sauf la dernière cellule de la liste (qui contient une référence nulle) ;
#### –	La liste donne accès à la première cellule, le reste de la liste est accessible en passant de cellule en cellule, suivant leur enchaînement.
Java implémente cela avec la classe java.util.LinkedList, une liste doublement chaînée, offrant des insertions/suppressions rapides, mais un accès aléatoire plus lent qu'un ArrayList, car il faut parcourir les nœuds séquentiellement. On peut créer une liste avec : 
LinkedList<Type> maListe = new LinkedList<>();
